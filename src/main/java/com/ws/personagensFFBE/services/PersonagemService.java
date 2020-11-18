package com.ws.personagensFFBE.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.personagensFFBE.entities.Personagem;
import com.ws.personagensFFBE.repositories.PersonagemRepository;

@Service
public class PersonagemService {
	
	@Autowired
	PersonagemRepository repository;
	
	public Personagem salvar(Personagem personagem) {
		return repository.save(personagem);
	}
	
}
