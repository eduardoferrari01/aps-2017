package br.com.aps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aps.entity.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

}
