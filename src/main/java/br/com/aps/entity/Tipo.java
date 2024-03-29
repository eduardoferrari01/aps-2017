package br.com.aps.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import jakarta.persistence.Entity;

@Entity
public class Tipo extends AbstractPersistable<Long>{

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
