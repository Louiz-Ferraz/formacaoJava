
public class TesteFuncionarioTeste {

	public static void main(String[] args) {
		FuncionarioTeste f1 = new FuncionarioTeste();
		f1.setSalario(3000);
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setSalario(7000);
		f2.setTipo(1);
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
	}
}
