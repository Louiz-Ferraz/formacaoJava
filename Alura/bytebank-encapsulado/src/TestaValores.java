
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1111, 2222);
		
		conta.setAgencia(-50);
		conta.setNumero(-333);
		
		System.out.println(conta.getAgencia() + " " + conta.getNumero());
		
		Conta conta2 = new Conta(1111, 2222);
		System.out.println("total de contas � " + Conta.getTotal());
		Conta conta3 = new Conta(1111, 2222);
		System.out.println("total de contas � " + Conta.getTotal());
		
	}
}
