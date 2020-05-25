package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
//		int[] idades = new int[5];
//		String[] names = new String[5];

		int idade = 29;	//Primitivo
		
		Integer idadeRef = Integer.valueOf(29);	//Referência - AUTOBOXING
		System.out.println(idadeRef.intValue()); //UNBOXING
		System.out.println("------");
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
		
		//As listas só aceitam referências. No entanto, o 
		//compilador faz AUTOBOXING, transformando o número
		//primitivo int em uma referência Integer
		
		numeros.add(idadeRef);
		
		System.out.println(numeros.get(0));
		System.out.println("------");
		System.out.println(numeros.get(1));
		System.out.println("------");
		
		System.out.println(idadeRef.doubleValue());
		System.out.println("------");
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("------");
		System.out.println(Integer.SIZE + " bits");
		System.out.println("------");
		System.out.println(Integer.BYTES + " bytes");
		System.out.println("------");
		
		String s = args[0];
//		Integer numero = Integer.valueOf(s); //Essa transformação é chamada PARSING
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
	}

}
