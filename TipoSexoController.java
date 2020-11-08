package com.angularMail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.angularMail.model.entities.TipoSexo;
import com.angularMail.model.repositories.tipoSexoRepository;

@CrossOrigin
@RestController
public class TipoSexoController {
	
	@Autowired
	tipoSexoRepository tipoSexoRep;
	
	@GetMapping("/tipoSexo/all")
	public Iterable<TipoSexo> getAllTipoSexo() {
		return this.tipoSexoRep.findAll();
	}
	

}
