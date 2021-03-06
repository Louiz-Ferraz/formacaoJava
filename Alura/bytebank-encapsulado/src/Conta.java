public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("o total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando a conta " + this.numero + " da ag�ncia " + this.agencia);
	}
	
	
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
		
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
	
}