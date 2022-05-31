package br.com.kaylaine.primeiroprojeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
       
    	List<Materia> materias = new ArrayList<>();

    	Materia materia1 = new Materia("Biologia", 9);
    	Materia materia2 = new Materia("Geografia", 7.5);
    	
    	materias.add(materia1);
    	materias.add(materia2);
    	
    	Aluno novoAluno = new Aluno("Maria", LocalDate.of(2005, 12, 02), materias);
    	
    	System.out.println("Aluno(a): " + novoAluno.getNomeCompleto() + "\n" +
    	novoAluno.getMaterias().get(0).getNome() + " - " + novoAluno.getMaterias().get(0).getNota() +
    	"\n" + novoAluno.getMaterias().get(1).getNome() + " - " + novoAluno.getMaterias().get(1).getNota());
    }
}
