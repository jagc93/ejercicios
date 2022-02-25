package jg.ejercicios.secuenciales;

import java.util.Scanner;

public class PuntoCuatro {

	/**
	 * Haga un programa que solicite el nombre del usuario e
	 * imprima a la pantalla las últimas dos letras del mismo.
	 */
	public static void main(String[] args) {
		try {
			Scanner leer = new Scanner(System.in);

			System.out.println("Ingrese el nombre de usuario");
			String nombre = leer.nextLine();

			System.out.println(nombre.substring(nombre.length() - 2));

			leer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}