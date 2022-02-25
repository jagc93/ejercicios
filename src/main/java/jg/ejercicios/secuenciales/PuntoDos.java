package jg.ejercicios.secuenciales;

import java.util.Scanner;

public class PuntoDos {

	/**
	 * Haga un programa que solicite el nombre del usuario y
	 * cuente un chiste corto usando el nombre del usuario
	 * como protagonista del chiste.
	 */

	public static void main(String[] args) {
		try {

			Scanner leer = new Scanner(System.in);
			System.out.println("Por favor, ingrese un nombre");
			String nombre = leer.nextLine();
			String chiste = "Una madre le dice a su hijo(a): " + nombre + ", me ha dicho un pajarito que te drogas. La que te drogas eres tú, que hablas con pajaritos.";

			System.out.println(chiste);

			leer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
