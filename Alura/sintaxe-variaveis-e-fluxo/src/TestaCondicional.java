
public class TestaCondicional {

	public static void main(String[] args) {

		//System.out.println("testando condicionais");
		int idade = 17;
		int quantidadePessoas = 2;

		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voc� n�o � maior de idade, mas est� "
						+ "acompanhado e pode entrar");
			} else {
				System.out.println("infelizmente, voc� n�o pode entrar");
			}
		}

	}

}
