package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		System.out.println("-----------");
		
		aulas.remove(0);
		System.out.println(aulas);
		System.out.println("-----------");
		
		int i = 1;
		
		for (String aula : aulas) { //foreach
			System.out.println("Aula " + i + ": " + aula);
			i++;
		}
		System.out.println("-----------");
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		System.out.println("-----------");
		
		for (int j = 0; j < aulas.size(); j++) {
			System.out.println("Aula " + (j + 1) + ": " + aulas.get(j));
		}
		System.out.println("-----------");
		
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula - " + aula);
		});
		System.out.println("-----------");
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		System.out.println("-----------");
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println("-----------");
		
	}

}
