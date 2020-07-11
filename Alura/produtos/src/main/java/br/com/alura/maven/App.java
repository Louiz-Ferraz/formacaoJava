package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Bala", 0.15); 
		
		
		System.out.println(produto.getNome() + " custa: " + produto.getPreco());
	}
}
