
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1, 1);
//		conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente luiz = new Cliente();
//		luiz.nome = "luiz ferraz";
		luiz.setNome("luiz ferraz");	
//		conta.titular = luiz;
		conta.setTitular(luiz);
		System.out.println(conta.getTitular().getNome());
		
	}
}
