package ejercicio10;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		/*
		 * Escriba un programa en el que el usuario debe adivinar un número aleatorio entre 1 y 100.
		 * El programa proporcionará pistas si el número es demasiado alto o demasiado bajo. 
		 * El juego continuará hasta que el jugador adivine correctamente el número.
		 * Al final, imprima el número y la cantidad de intentos realizados.
		 */
		
		// Generar número aleatorio entre 1 y 100
		int numeroMagico = ThreadLocalRandom.current().nextInt(1, 100);
		// Crear Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Solicitar un número al usuario
		int numeroUsuario;
		do {
		    System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
		    numeroUsuario = sc.nextInt();
		    if (numeroMagico > numeroUsuario) {
		        System.out.println("Número demasiado bajo, intenta nuevamente");
		    } else if (numeroMagico < numeroUsuario) {
		        System.out.println("Número demasiado alto, intenta nuevamente");
		    }
		} while (numeroMagico != numeroUsuario);
		
		
		System.out.println("¡Felicidades! ¡Haz adivinado el número!: " + numeroMagico);
	}

}
