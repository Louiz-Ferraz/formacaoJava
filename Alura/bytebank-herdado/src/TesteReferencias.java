
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("luiz");
		g1.setSalario(5000);

//		Funcionario f1 = new Funcionario();
//		f1.setSalario(1000);
		 
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2500);

		Designer d1 = new Designer();
		d1.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(ev1);
		controle.registro(d1);

		System.out.println(controle.getSoma());

	}

}
