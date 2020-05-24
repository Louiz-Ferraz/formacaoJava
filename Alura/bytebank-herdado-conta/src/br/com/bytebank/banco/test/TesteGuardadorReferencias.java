package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		Conta cc = new ContaCorrente(111, 222);
		Conta cp = new ContaPoupanca(333, 444);
		Conta cp2 = new ContaPoupanca(555, 666);
		Cliente cliente = new Cliente();
		
		guardador.adiciona(cc);
		guardador.adiciona(cp);
		guardador.adiciona(cp2);
		guardador.adiciona(cliente);
		
		System.out.println(guardador.getQuantidadeDeElementos());
		
		Object ref = guardador.getReferencia(2);
		System.out.println(ref);
		
	}

}
