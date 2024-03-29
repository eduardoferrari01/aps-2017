package br.com.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aps.entity.Tipo;
import br.com.aps.service.TipoService;

@RestController
@RequestMapping("/rest/tipo")
public class TipoController {

	@Autowired
	private TipoService tipoService;

	@PostMapping
	public ResponseEntity<Tipo> salvar(@RequestBody Tipo tipo) {
		tipoService.salvar(tipo);
		return new ResponseEntity<Tipo>(HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Tipo> alterar(@RequestBody Tipo tipo) {
		tipoService.salvar(tipo);
		return new ResponseEntity<Tipo>(HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<Iterable<Tipo>> buscarTodos() {
		return new ResponseEntity<Iterable<Tipo>>(tipoService.buscarTodos(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tipo> buscarPorId(@PathVariable Long id) {
		return new ResponseEntity<Tipo>(tipoService.buscarPorId(id), HttpStatus.OK);
	}

}
