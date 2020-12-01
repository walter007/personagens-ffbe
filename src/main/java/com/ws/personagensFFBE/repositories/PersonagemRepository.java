package com.ws.personagensFFBE.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ws.personagensFFBE.entities.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer>{
	@Query("select p from Personagem p where upper(p.nome) like upper(:nome)")
	List<Personagem>findAllByName(@Param("nome") String nome );
}
