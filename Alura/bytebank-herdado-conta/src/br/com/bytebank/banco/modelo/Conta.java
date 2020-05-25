package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author Luiz Felipe
 *
 */
public abstract class Conta implements Comparable<Conta> {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor para inicializar a Conta a partir de Agência e Número.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("estou criando a conta " + this.numero + " da agência " + this.agencia);
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {		
		this.saca(valor);
		destino.deposita(valor);	
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
			return;
		}
		System.out.println("numero da agencia ser positivo");
	}
	
	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
			return;
		}
		System.out.println("numero da conta ser positivo");
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Agencia: " + this.agencia +", Numero: " + this.numero + ", Saldo: " + this.saldo;
	}

	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
}