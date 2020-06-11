package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	
	public static void main(String[] args) {
		
		 Collection<Integer> numeros = new HashSet<Integer>(); //Trocar o HashSet por uma ArrayList mostra as diferenças de tempo de execução

	        long inicio = System.currentTimeMillis();

	        for (int i = 1; i <= 50000; i++) {
	            numeros.add(i);
	        }
	        
	        long fimAdicionar = System.currentTimeMillis();
	        long tempoDeExecucaoAdicionar = fimAdicionar - inicio;
	        System.out.println("Tempo gasto para adicionar: " + tempoDeExecucaoAdicionar);
	        
	        long inicioConter = System.currentTimeMillis();
	        
	        for (Integer numero : numeros) {
	            numeros.contains(numero);
	        }

	        long fimConter = System.currentTimeMillis();
	        long tempoDeExecucaoConter = fimConter - inicioConter;
	        System.out.println("Tempo gasto com contains: " + tempoDeExecucaoConter);
	        
	        long fim = System.currentTimeMillis();

	        long tempoDeExecucao = fim - inicio;

	        System.out.println("Tempo gasto total: " + tempoDeExecucao);
		
	}
	
}
