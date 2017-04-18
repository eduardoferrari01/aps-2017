package br.com.aps.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.aps.entity.Titulo;
import br.com.aps.repository.TituloRepository;

@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRED)
public class TituloService {

	@Autowired
	private TituloRepository tituloReposirty;
	
	@Transactional(readOnly = false)
	public void salvar(Titulo titulo)
	{
		tituloReposirty.save(titulo);
	}
	
	public Collection<Titulo> buscarTodos()
	{
		return tituloReposirty.findAll();
	}
	
	public Titulo buscarPorId(Long id)
	{
		return tituloReposirty.findOne(id);
	}
	
	public Page<Titulo> buscarPorPaginacao(int pagina,int tamanho)
	{
		Pageable pageable = new PageRequest(pagina,tamanho);
		return tituloReposirty.findAll(pageable);
	}
}
