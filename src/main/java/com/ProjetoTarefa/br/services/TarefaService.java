package com.ProjetoTarefa.br.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoTarefa.br.domain.Tarefa;
import com.ProjetoTarefa.br.repositories.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository repo;

	public List<Tarefa> listarTodos() {
		return repo.findAll();
	}

	public Tarefa buscarId(Integer id) {
		Optional<Tarefa> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public void delete(Integer id) {
		repo.deleteById(id);

	}

	public void update(Tarefa obj, Integer id) {
		obj.setId(id);
		repo.save(obj);

	}

	public void insert(Tarefa obj) {
		obj.setId(null);
		repo.save(obj);
	}

}
