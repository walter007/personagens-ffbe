package com.ws.personagensFFBE.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.personagensFFBE.entities.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer>{

}
