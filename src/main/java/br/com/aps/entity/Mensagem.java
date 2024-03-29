package br.com.aps.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import jakarta.persistence.Entity;

@Entity
public class Mensagem extends AbstractPersistable<Long> {

	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
