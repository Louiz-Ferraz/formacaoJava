package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject1 extends Object {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println(2);
		System.out.println("x");
		System.out.println('x');
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(11, 22);
		ContaPoupanca cp = new ContaPoupanca(33, 44);
		
		System.out.println(cc);
//		System.out.println(cc.toString());
		System.out.println(cp);
//		System.out.println(cp.toString());
		
	}

}
