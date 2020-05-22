
public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("o total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("estou criando a conta " + this.numero + " da ag�ncia " + this.agencia);
	}
	
	
	public abstract void deposita(double valor);
	
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
	
}