package com.ws.personagensFFBE.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ws.personagensFFBE.enums.Classe;
import com.ws.personagensFFBE.enums.Qualidade;


@Entity
public class Personagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private int quantidade;
	
	@Column
	private Classe classe;
	
	@Column
	private Qualidade qualidade;
	
	public Personagem(){
		
	}

	public Personagem(Integer id, String nome, int quantidade, Classe classe, Qualidade qualidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.classe = classe;
		this.qualidade = qualidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Qualidade getQualidade() {
		return qualidade;
	}

	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
