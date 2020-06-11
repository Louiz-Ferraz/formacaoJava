package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche"); //Sets não aceitam objetos repetidos
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		System.out.println("----------");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println("----------");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println("----------");
		
		Boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		Boolean nicoEstaMatriculado = alunos.contains("Nico Steppat");
		System.out.println(nicoEstaMatriculado);
		System.out.println("----------");
		
		alunos.remove("Alberto Souza");
		System.out.println(alunos);
		System.out.println(alunos.size());
		System.out.println("----------");
		
	}
	
}
