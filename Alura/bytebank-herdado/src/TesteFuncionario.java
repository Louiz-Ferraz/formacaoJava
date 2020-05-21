
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente luiz = new Gerente();
		luiz.setNome("luiz ferraz");
		luiz.setCpf("432.222.222-22");
		luiz.setSalario(3000);
		
		System.out.println(luiz.getNome());
		System.out.println(luiz.getBonificacao());
	}

}
