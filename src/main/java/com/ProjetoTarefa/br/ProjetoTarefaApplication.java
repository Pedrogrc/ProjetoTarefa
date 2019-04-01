package com.ProjetoTarefa.br;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ProjetoTarefa.br.domain.Tarefa;
import com.ProjetoTarefa.br.enums.EstadoTarefa;
import com.ProjetoTarefa.br.repositories.TarefaRepository;

@SpringBootApplication
public class ProjetoTarefaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoTarefaApplication.class, args);
	}
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Tarefa t1 = new Tarefa(null,"Terminar o trabalho do nene",sdf.parse("28/03/2019 22:00"),EstadoTarefa.CONCLUIDA);
		Tarefa t2 = new Tarefa(null,"Almoçar",sdf.parse("12/04/2019 12:30"),EstadoTarefa.PENDENTE);
		Tarefa t3 = new Tarefa(null,"Dormir",sdf.parse("29/03/2019 23:50"),EstadoTarefa.ATRASADA);
		Tarefa t4 = new Tarefa(null,"Fazer a modelagem do sistema SA",sdf.parse("06/04/2019 18:00"),EstadoTarefa.PENDENTE);
		Tarefa t5 = new Tarefa(null,"Dar comida para o gato",sdf.parse("29/03/2019 00:00"),EstadoTarefa.ATRASADA);
		
		
		
		tarefaRepository.save(t1);
		tarefaRepository.save(t2);
		tarefaRepository.save(t3);
		tarefaRepository.save(t4);
		tarefaRepository.save(t5);
		
		
	}

}
