package com.fatec.scc.model.animalReport;

import javax.validation.constraints.NotBlank;

public class RelatorioAnimalDTO {
	private String medicamento;
	@NotBlank(message = "Categoria é requerido")
	private String categoriaAnimal;
	@NotBlank(message = "A data da chegada é obrigatoria")
	private String dataChegada;
	@NotBlank(message = "O local onde o animal foi encontrado é requerida")
	private String local;
	@NotBlank(message = "A descrição do Animal é necessaria.")
	private String descricao;

	
	//=================== CONTRUTORES ========================
	
	public RelatorioAnimalDTO() {
		
	}
	
	public RelatorioAnimalDTO(String medicamento,String categoriaAnimal,String dataChegada , String local, String descricao) {
		
		this.medicamento = medicamento;
		this.categoriaAnimal= categoriaAnimal;
		this.dataChegada = dataChegada;
		this.local = local;
		this.descricao = descricao;
	}
	
	
	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getCategoriaAnimal() {
		return categoriaAnimal;
	}

	public void setCategoriaAnimal(String categoriaAnimal) {
		this.categoriaAnimal = categoriaAnimal;
	}

	public String getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public RelatorioAnimal retornoumRelatorioAnimal () {
		return new RelatorioAnimal(medicamento,categoriaAnimal,dataChegada,local,descricao);
	}
}