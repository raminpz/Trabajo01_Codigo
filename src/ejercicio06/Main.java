package ejercicio06;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Dado un valor n, genere la siguiente secuencia:
		 */
		 System.out.println("Ingrese numero: ");
		 int filas = sc.nextInt();
		 izq(filas);

	}
	
	public static void izq(int n) {
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	             System.out.println("*");
	        }
	        System.out.println("");
	    }
	
	}

}
