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

import br.com.aps.entity.Mensagem;
import br.com.aps.service.MensagemService;

@RestController
@RequestMapping("/rest/mensagem")
public class MensagemController {

	@Autowired
	private MensagemService mensagemService;

	@PostMapping
	public ResponseEntity<Mensagem> salvar(@RequestBody Mensagem mensagem) {
		mensagemService.salvar(mensagem);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Mensagem> alterar(@RequestBody Mensagem mensagem) {
		mensagemService.salvar(mensagem);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<Iterable<Mensagem>> buscarTodos() {
		return new ResponseEntity<Iterable<Mensagem>>(mensagemService.buscarTodos(), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Mensagem> buscarPorId(@PathVariable Long id) {
		return new ResponseEntity<Mensagem>(mensagemService.buscarPorId(id), HttpStatus.OK);
	}

}
