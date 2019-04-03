package com.ProjetoTarefa.br.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoTarefa.br.domain.Tarefa;
import com.ProjetoTarefa.br.services.TarefaService;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefaResource {

	@Autowired
	private TarefaService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Tarefa>> listarTodos() {

		List<Tarefa> lista = service.listarTodos();

		return ResponseEntity.ok(lista);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Tarefa> buscar(@PathVariable Integer id) {

		Tarefa obj = service.buscarId(id);
		return ResponseEntity.ok(obj);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {

		service.delete(id);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Tarefa obj, @PathVariable Integer id) {
		service.update(obj, id);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Tarefa obj) {
		service.insert(obj);
		return ResponseEntity.noContent().build();

	}

}