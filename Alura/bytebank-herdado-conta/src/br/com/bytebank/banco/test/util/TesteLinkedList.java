package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLinkedList {

	public static void main(String[] args) {
		
//		Os símbolos <> são chamados GENERICS
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(111, 222);
		Conta cp = new ContaPoupanca(333, 444);
		Conta cp2 = new ContaPoupanca(555, 666);
		
		lista.add(cc);
		lista.add(cp);
		lista.add(cp2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(2);
		System.out.println(ref.getNumero());
		
		System.out.println("-----------");
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		System.out.println("-----------");
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----------");
		
		//Método equivalente, mais elegante e mais recente ao laço for anterior
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
