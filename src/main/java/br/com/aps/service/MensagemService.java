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

import br.com.aps.entity.Mensagem;
import br.com.aps.repository.MensagemRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MensagemService {

	@Autowired
	private MensagemRepository mensagemRepository;

	@Transactional(readOnly = false)
	public void salvar(Mensagem mensagem) {
		mensagemRepository.save(mensagem);
	}

	public Collection<Mensagem> buscarTodos() {
		return mensagemRepository.findAll();
	}

	public Mensagem buscarPorId(Long id) {
		return mensagemRepository.findById(id).get();
	}

	public Page<Mensagem> buscarPorPaginacao(int pagina, int tamanho) {
		
		Pageable pageable = PageRequest.of(pagina, tamanho	, Sort.by("texto").descending());
		
		return mensagemRepository.findAll(pageable);
	}

}
