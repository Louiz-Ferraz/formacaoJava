
public class OpcionalFatorial {
	
	public static void main(String[] args) {
		
		int atual = 1;
		for (int contador = 1; contador <= 10; contador++) {
			
			atual *= contador;
			System.out.println("Fatorial de " + contador + " é " + atual);
			
		}
		
	}
	
}
