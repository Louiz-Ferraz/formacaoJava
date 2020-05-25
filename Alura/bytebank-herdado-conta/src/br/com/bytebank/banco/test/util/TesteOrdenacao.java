package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Lista Desordenada:");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		System.out.println("--------------");
		
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		lista.sort(comparator);
		
		System.out.println("Lista Ordenada por Numero:");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		System.out.println("--------------");
		
		lista.sort(new TitularDaContaComparator());
		
		System.out.println("Lista Ordenada por Titular:");
		for(Conta conta : lista) {
			System.out.println(conta + ", Titular: " + conta.getTitular().getNome());
		}
		System.out.println("--------------");
		
//		Collections.sort(lista, new NumeroDaContaComparator());
		Collections.sort(lista);
		
		System.out.println("Lista Ordenada por Saldo (C�digo legado - anterior ao Java 8):");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		System.out.println("--------------");
		
	}
}

//FUNCTION OBJECTS - O TitularDaContaComparator � um objeto que s� encapsula um m�todo ou uma fun��o
class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
		
	}
	
}

//FUNCTION OBJECTS - O NumeroDaContaComparator � um objeto que s� encapsula um m�todo ou uma fun��o
class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
//		M�todo 3:
		return Integer.compare(c1.getNumero(), c2.getNumero());
//		---------------------------------------------
//		M�todo 2:
//		return c1.getNumero() - c2.getNumero();
//		---------------------------------------------
//		M�todo 1:
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
		
	}
	
}
