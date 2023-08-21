package ejercicio08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * Escriba un programa que reciba un valor n, que será el tamaño de un array que se inicializará y llenará.
		 *  Luego, encuentre cuál es el valor más grande.
		 */
		
		System.out.print("Ingrese el tamaño del array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para el índice " + i + ": ");
            array[i] = sc.nextInt();
        }

        int max = numMax(array);

        System.out.println("El valor más grande en el array es: " + max);

        sc.close();

	}
	private static int numMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
