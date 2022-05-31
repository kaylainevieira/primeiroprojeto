package br.com.kaylaine.primeiroprojeto;

import java.time.LocalDate;
import java.util.List;

public class Aluno {

	private String nomeCompleto;
	
	private LocalDate dataDeNascimento;
	
	private List<Materia> materias;

	public Aluno() {
	
	}

	public Aluno(String nomeCompleto, LocalDate dataDeNascimento, List<Materia> materias) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataDeNascimento = dataDeNascimento;
		this.materias = materias;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

    
	
	
}
