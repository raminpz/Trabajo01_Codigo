package ejercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * La operación factorial se define de la siguiente manera: 
		 * Cree una clase Factorial que tenga un método llamado resolverFactorial que reciba un valor n,
		 * donde n es el valor del factorial a calcular.
		 */
		
		System.out.println("Ingrese un numero: ");
		int fact = sc.nextInt();
		System.out.println("El factorial es: "+ factorial(fact));
		

	}
	
	static int factorial(int numero){
        if (numero > 1) {
            numero = numero * factorial(numero - 1);
        }
        return numero;
    }

}
