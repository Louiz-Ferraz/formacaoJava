package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaEspecial ce = new ContaEspecial(666, 666);
		ce.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CE: " + ce.getSaldo());
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
