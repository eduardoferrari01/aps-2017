package br.com.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.aps.entity.Titulo;
import br.com.aps.service.TituloService;

@RestController
@RequestMapping("/rest/titulo")
public class TituloController {

	@Autowired
	private TituloService tituloService;
	
	@PostMapping
	public ResponseEntity<Titulo> salvar(@RequestBody Titulo titulo)
	{
		tituloService.salvar(titulo);
		return new ResponseEntity<Titulo>(HttpStatus.CREATED);
	}
	@PutMapping
	public ResponseEntity<Titulo> alterar(@RequestBody Titulo titulo)
	{
		tituloService.salvar(titulo);
		return new ResponseEntity<Titulo>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Page<Titulo>> buscarTodos(@RequestParam(defaultValue="0", required=false) int page
			,@RequestParam(defaultValue="0", required=false) int maxResults)
	{
		Page<Titulo> paginas = tituloService.buscarTodos(new PageRequest(page, maxResults));
		return new ResponseEntity<Page<Titulo>>(paginas,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Titulo> buscarPorId(@PathVariable Long id)
	{
		return new ResponseEntity<Titulo>(tituloService.buscarPorId(id),HttpStatus.OK);
	}
	
}
