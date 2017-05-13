package br.com.aps.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;

@Entity
public class Titulo extends AbstractPersistable<Long> {

	private String descricao;
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private Tipo tipo;
	
	@OneToOne
	@JoinColumn(name = "id_mensagem")
	private Mensagem mensagem;

	private String caminhoImagem;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}
	
	
}
