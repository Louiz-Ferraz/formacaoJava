
public class TestaBanco {

	public static void main(String[] args) {
		Cliente luiz = new Cliente();
		luiz.nome = "luiz ferraz";
		luiz.cpf = "222.222.222-22";
		luiz.profissao = "engenheiro";
		
		Conta contaDoLuiz = new Conta();
		contaDoLuiz.deposita(100);
		
		contaDoLuiz.titular = luiz;
		System.out.println(contaDoLuiz.titular.nome);
	}
}
