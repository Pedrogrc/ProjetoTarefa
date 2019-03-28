package com.ProjetoTarefa.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoTarefa.br.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

}
