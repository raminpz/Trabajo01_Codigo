package ejercicio04;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		* Escriba un programa que reciba un número n e imprima los números impares menores a n.		
		*/
		System.out.print("Ingrese un número n: ");
        int n = sc.nextInt();
        
        System.out.println("Números impares menores a " + n + ":");
        for (int i = 1; i < n; i += 2) {
            System.out.println(i);
        }
        
        sc.close();
	}

}
