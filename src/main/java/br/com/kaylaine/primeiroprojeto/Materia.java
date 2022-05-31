package br.com.kaylaine.primeiroprojeto;

public class Materia {

	private String nome;
	
	private double nota;

	public Materia() {
		super();
	}

	public Materia(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
