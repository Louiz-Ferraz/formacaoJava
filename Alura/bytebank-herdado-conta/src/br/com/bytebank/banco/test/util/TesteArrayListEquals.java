package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(111, 222);
//		Conta cc2 = new ContaPoupanca(333, 444);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
//		Os s�mbolos <> s�o chamados GENERICS
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(111, 222);
		Conta cc2 = new ContaPoupanca(333, 444);
		Conta cc3 = new ContaCorrente(111, 222); //Agencia e numero igual cc1
		
		lista.add(cc1);
		lista.add(cc2);
		
		boolean existe = lista.contains(cc3); //O m�todo contains utiliza o m�todo equals da classe Object (que compara refer�ncias), se ele for sobrescrito na classe utilizada na Array, utilizar� a sobrescrita
		System.out.println("J� existe? " + existe);
		
		System.out.println("----------");
		
		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("J� tenho essa conta!");
			}
		}
		
		System.out.println("----------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
