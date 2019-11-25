package com.api.labs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.api.labs.model.Formulario;
import com.api.labs.repository.FormularioRepository;



@Service(value = "formularioService")
public class FormularioServiceImpl implements FormularioService{
	
	
	final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private FormularioRepository formularioRepository;

	@Override
	public List<Formulario> findAll() throws Exception {
		List<Formulario> formularioList = new ArrayList<>();
		formularioList = formularioRepository.findAll();
		return formularioList;
	}

	@Override
	public Formulario save(Formulario formulario) throws Exception {
		Formulario formularioFind = formularioRepository.findByFechaProgramada(formulario.getFechaProgramada());
		try {
			if (null == formularioFind) {
				formulario.setFechaSolicitud(new Date());
				formularioRepository.save(formulario);
				
				return formulario;
			} else {
				throw new Exception("La facultad ya existe");
			}

		} catch (Exception e) {
			log.info("La facultad ya existe");
			if (e instanceof Exception) {
				throw e;
			} else {
				throw new Exception("ocurrio un error al guardar");
			}
		}
		
	}

	@Override
	public Formulario getFindById(Long id) throws Exception {
		Formulario formulario = formularioRepository.getFindById(id);
		return formulario;
	}
	
	

}
