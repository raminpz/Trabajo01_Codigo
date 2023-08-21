package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
         * Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa.
        Sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera como horas extra y estas se pagan al doble
        de una hora normal cuando no exceden las 8 horas; si las horas extras exceden de 8, se pagan las primeras 8 al doble de
        lo que se paga por una hora normal y el resto al triple. El trabajador cobra por hora $40.
         */
		Scanner sc = new Scanner(System.in);

        int horaSueldo= 40;
        int horasExtras;
        int sueldo = 9600;
        int sueldoNeto;


        System.out.println("Ingrese las horas extras: ");
        horasExtras = sc.nextInt();

        if (horasExtras > 0 && horasExtras <= 8) {
            sueldoNeto = sueldo + (horasExtras * (horaSueldo * 2));
            System.out.println("Sueldo con horas extras es: " + sueldoNeto);
        } else if (horasExtras > 8) {
            sueldoNeto = sueldo + (horasExtras * (horaSueldo * 3));
            System.out.println("Sueldo con horas extras es: " + sueldoNeto);
        } else {
            System.out.println("No tienes horas extras, tu sueldo es: " + sueldo);
        }

	}

}
