package ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * Se le pide implementar un sistema de ingreso digital para una fiesta de
		 * quince años. Para ello, se han determinado una serie de reglas. Todas las
		 * personas con edades mayores o iguales a 15 años solo pueden entrar si traen
		 * regalos. Los jóvenes menores de 15 años entran gratis a la fiesta. Implemente
		 * una aplicación que permita ingresar la edad de la persona y determine si
		 * puede pasar o no
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa tu edad: ");
		int edad = sc.nextInt();


		if (edad >= 15) {
			System.out.println("Traes regalo?: ");
			sc.nextLine();
			String rpt = sc.nextLine();
			if (rpt.equalsIgnoreCase("si")) {
				System.out.println("Puedes ingresar a la fiesta chaval...!!");
			}else {
				System.out.println("Lo siento chaval, no puedes ingresar, vuelve con tú regalo");
			}
		} else {
			System.out.println("Bienvenido a la fiesta..!!");
		}
		sc.close();

	}

}
