package ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * Implemente una aplicación que permita calcular el pago que debe realizar una familia por el consumo de agua potable.
		 *  Se sabe que existe un pago fijo de $10.00 y que los primeros 50 litros de agua no tienen costo.
		 *  Entre 51 y 200 litros se cobra $0.5 por litro, y más de 200 litros a $1.5 por litro.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad del consumo de agua: ");
		int cantidadConsumo = sc.nextInt();
		
		if (cantidadConsumo >= 1 && cantidadConsumo <= 50) {
			System.out.println("Tú facturacion es gratis...! ");
		}else if (cantidadConsumo >= 51 && cantidadConsumo <= 200) {
			double total = cantidadConsumo * 0.5;
			System.out.println("Tu facturacion es S/. "+ total);
		}else {
			double consMayor = cantidadConsumo * 1.5; 
			System.out.println("Tú facturacion es S/. "+ consMayor);
		}
		
		sc.close();
	}

}
