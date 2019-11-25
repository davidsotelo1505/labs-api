package com.api.labs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.labs.model.Formulario;
import com.api.labs.service.FormularioService;
import com.api.labs.util.GeneralResponse;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "formLabs", description = "Operaciones correspondientes a la gestión de laboratorios de la plataformas Universidad Libre")
@RestController
@RequestMapping("/formularios")
public class FormularioController {
	
	final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private FormularioService formularioService;
	
	@ApiOperation(value = "Registrar un Usuario en la platafroma Universidad Libre. Sin Rol Especifico", response = ResponseEntity.class)
	@RequestMapping(method = RequestMethod.POST)
	@CrossOrigin(origins = "*")
	public ResponseEntity<GeneralResponse<Formulario>> saveFacultad(@RequestBody Formulario formulario) {
		GeneralResponse<Formulario> response = new GeneralResponse<>();
		HttpStatus status = HttpStatus.OK;
		try {

			Formulario formularioSaved = formularioService.save(formulario);
			// response.setData(userSaved);
			response.setSuccess(true);
			response.setMessage("Laboratorio guardado exitosamente");
			status = HttpStatus.OK;

		} catch (Exception e) {

			status = HttpStatus.BAD_REQUEST;
			response.setSuccess(false);
			response.setMessage("Laboratorio ya fue reservador");

		}
		return new ResponseEntity<GeneralResponse<Formulario>>(response, status);

	}
	
	@ApiOperation(value = "Mostrtar los laboratorios en la platafroma Universidad Libre. Sin Rol Especifico", response = ResponseEntity.class)
	@RequestMapping(method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public List<Formulario> getFormularioList() throws Exception {
		return formularioService.findAll();
	}
	
	@ApiOperation(value = "BUscar por id en la platafroma Universidad Libre. Sin Rol Especifico", response = ResponseEntity.class)
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public ResponseEntity<Formulario> getUserById(@PathVariable(name = "id")Long id) throws Exception {
		Formulario facultad =formularioService.getFindById(id);
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<Formulario>(facultad, status);
	}
}
