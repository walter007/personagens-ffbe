package com.ws.personagensFFBE.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
	
	
	public List<Personagem> listar(String nome) {
		return repository.findAllByName("%"+nome+"%");
	}
	
}
