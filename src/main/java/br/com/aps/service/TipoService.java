package br.com.aps.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.aps.entity.Tipo;
import br.com.aps.repository.TipoRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class TipoService {

	@Autowired
	private TipoRepository tipoRepository;

	@Transactional(readOnly = false)
	public void salvar(Tipo tipo) {
		tipoRepository.save(tipo);
	}

	public Collection<Tipo> buscarTodos() {
		return tipoRepository.findAll();
	}

	public Tipo buscarPorId(Long id) {
		return tipoRepository.findById(id).get();
	}

	public Page<Tipo> buscarPorPaginacao(int pagina, int tamanho) {

		Pageable pageable = PageRequest.of(pagina, tamanho, Sort.by("descricao").descending());

		return tipoRepository.findAll(pageable);
	}
}
