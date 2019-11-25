package com.api.labs.service;

import java.util.List;

import com.api.labs.model.Formulario;


public interface FormularioService {
	
	List<Formulario> findAll() throws Exception;
	
	Formulario save(Formulario formulario) throws Exception;
	
	Formulario getFindById(Long id) throws Exception;
}
