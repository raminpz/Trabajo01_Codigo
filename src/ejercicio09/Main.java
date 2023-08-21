package ejercicio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * Escriba un programa que reciba un valor n, que será el tamaño de un array que se inicializará y llenará.
		 * Posteriormente, invierta el array (sin usar clases como ArrayList o similares).
		 */
		
		System.out.print("Ingrese el tamaño del array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para el índice " + i + ": ");
            array[i] = sc.nextInt();
        }

        invertirArr(array);

        System.out.println("Array invertido:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        sc.close();

	}
	
	private static void invertirArr(int[] array) {
		int left = 0;
		int right = array.length - 1;
		
		while (left < right) {
			int temp = array[left];
			array[right] = temp;

            left++;
            right--;
		}
	}

}
