import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int calculo = 0;
            for(int contadorJ = 1; contadorJ <= n; contadorJ++) {
                calculo = a;
                for(int contadorK = 1; contadorK <= contadorJ; contadorK++) {
                    calculo += Math.pow(2, contadorK - 1) * b;
                }
                System.out.print(calculo + " ");
            }
            System.out.println("");
        }
        in.close();
        
    }
    
}
