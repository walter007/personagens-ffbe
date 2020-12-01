package com.ws.personagensFFBE.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ws.personagensFFBE.entities.Personagem;
import com.ws.personagensFFBE.services.PersonagemService;

@RestController
@RequestMapping(value = "/personagens")
@CrossOrigin(value = "http://localhost:4200")
public class PersonagemResource {
	
	@Autowired
	private PersonagemService  service;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	private Personagem salvar(@RequestBody Personagem personagem) {
		return service.salvar(personagem);
	}
	
	@GetMapping
	private List<Personagem> Listar(@RequestParam String nome) {
		return service.listar(nome);
	}
	
}
