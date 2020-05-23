package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //Sintaxe chamada de object literal
		System.out.println("string original: " + nome);
		
		char c = 'A';
		char d = 'a';
		String nomecorrigido = nome.replace(c, d);
		System.out.println("replace: " + nomecorrigido);
		
		String nomecorrigido2 = nomecorrigido.toUpperCase();
		System.out.println("upperCase: " + nomecorrigido2);
		
		String nomecorrigido3 = nomecorrigido.toLowerCase();
		System.out.println("lowerCase: " + nomecorrigido3);
		
		char b = nome.charAt(2); //CONTAGEM INICIA NO 0
		System.out.println("charAt: " + b);
		
		int pos = nome.indexOf("ur");
		System.out.println("index: " + pos);
		
		String sub = nome.substring(1, 4);
		System.out.println("substring: " + sub);
		
		System.out.println("tamanho: " + nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println("string é vazio? " + nome.isEmpty());
		System.out.println("string é vazio? " + "".isEmpty());
		
		String espaco = "     adsa     ";
		String espaco2 = espaco.trim(); //Tira os espaços do começo e fim
		System.out.println("tirou os espacos?" + espaco2);
		
		System.out.println("Nome contem? " + nome.contains("lur"));
		
	}

}
