package com.api.labs.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.labs.model.Formulario;

@Repository
public interface FormularioRepository extends MongoRepository<Formulario, String> {

	Formulario findByFechaProgramada(Date fechaProgramada);

	Formulario getFindById(Long id);
}

