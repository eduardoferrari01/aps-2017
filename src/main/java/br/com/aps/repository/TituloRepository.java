package br.com.aps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aps.entity.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

}
