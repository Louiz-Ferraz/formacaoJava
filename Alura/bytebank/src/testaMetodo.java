
public class testaMetodo {

	public static void main(String[] args) {
		Conta contaDoLuiz = new Conta();
		contaDoLuiz.saldo = 100;
		contaDoLuiz.deposita(50);
		System.out.println(contaDoLuiz.saldo);
		
		boolean conseguiuRetirar = contaDoLuiz.saca(30);
		if(conseguiuRetirar) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println(contaDoLuiz.saldo);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(200, contaDoLuiz);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoLuiz.saldo);
		
		contaDoLuiz.titular = "Luiz Ferraz";
		System.out.println(contaDoLuiz.titular);
	}
}
