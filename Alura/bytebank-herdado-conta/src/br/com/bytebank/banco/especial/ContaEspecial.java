package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.*;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

}
