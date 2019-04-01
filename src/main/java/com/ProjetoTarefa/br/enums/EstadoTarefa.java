package com.ProjetoTarefa.br.enums;

public enum EstadoTarefa {
	
	CONCLUIDA(1,"Concluída"), PENDENTE(2,"Em andamento"), ATRASADA(3,"Atrasada");
	
	private Integer codigo;
	private String descricao;
	
	
	private EstadoTarefa(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static EstadoTarefa toEnum(Integer codigo) {
		for (EstadoTarefa estado : EstadoTarefa.values()) {
			if (estado.getCodigo() == codigo)
				return estado;
		}
		return null;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	

}
