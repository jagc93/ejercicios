package jg.ejercicios.secuenciales;

import java.util.Scanner;

public class PuntoTres {

	/**
	 * Haga un programa que solicite el nombre de un país y
	 * devuelva las primeras dos letras del mismo.
	 */

	public static void main(String[] args) {
		try {
			Scanner leer = new Scanner(System.in);
			System.out.println("Por favor, ingrese el nombre de un País");
			String pais = leer.nextLine();

			String iniciales = pais.substring(0, 2);
			System.out.println(iniciales);
			leer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
