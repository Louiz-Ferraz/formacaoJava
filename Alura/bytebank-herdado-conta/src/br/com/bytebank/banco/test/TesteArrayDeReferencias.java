package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[6]; //Inicializado com nulls
//		ContaCorrente[] contas = new ContaCorrente[5];
		
		
		ContaCorrente cc1 = new ContaCorrente(222, 111);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(444, 333);
		referencias[1] = cc2;
		
		ContaCorrente cc3 = new ContaCorrente(666, 555);
		referencias[2] = cc3;
		
		ContaCorrente cc4 = new ContaCorrente(888, 777);
		referencias[3] = cc4;
		
		ContaCorrente cc5 = new ContaCorrente(1, 999);
		referencias[4] = cc5;
		
		Cliente cliente1 = new Cliente();
		referencias[5] = cliente1;
		
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < referencias.length - 1; i++) {
			System.out.println(((Conta) referencias[i]).getNumero());
		}
		
		System.out.println("");
		
		Conta ref = (Conta) referencias[1]; //Só compila se o ref for do mesmo tipo da array
		ContaPoupanca ref2 = (ContaPoupanca) referencias[1]; //Pra compilar sem ser do mesmo tipo da array, preciso fazer um TYPE CAST (transformo o contas[1] em um tipo ContaPoupanca
		
		System.out.println(ref.getNumero());
		System.out.println(((Conta) referencias[1]).getNumero());
		System.out.println(cc2.getNumero());
		System.out.println(ref2.getNumero());
	}

}
