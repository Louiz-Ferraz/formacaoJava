package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);		//AUTOBOXING
		System.out.println(idadeRef.intValue());	//UNBOXING
		
		Double dRef = Double.valueOf(3.2);			//AUTOBOXING
		System.out.println(dRef.doubleValue());		//UNBOXING
		
		Boolean bRef = Boolean.TRUE;				//AUTOBOXING
		System.out.println(bRef.booleanValue());	//UNBOXING
		
		Number numRef = Double.valueOf(0.53);
		System.out.println(numRef.doubleValue());
		
		List<Number> lista = new ArrayList<>();
		lista.add(2);
		lista.add(32.6);
		lista.add(66.99f);
		
		System.out.println("-------");
		for(Number numero : lista) {
			System.out.println(numero);
		}
	}

}
