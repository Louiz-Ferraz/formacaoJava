
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
