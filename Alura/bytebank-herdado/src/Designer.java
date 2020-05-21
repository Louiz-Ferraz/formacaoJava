
public class Designer extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando regra padrão de Designer");
		return 200;
	}
	 

}

