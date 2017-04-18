package br.com.aps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aps.entity.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Long> {

}
