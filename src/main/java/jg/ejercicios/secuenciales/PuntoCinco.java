package jg.ejercicios.secuenciales;

import java.util.Scanner;

public class PuntoCinco {

	/**
	 * Haga un programa que solicite el primer nombre, primer apellido y dominio
	 * en el cual quiere tener un correo electrónico (hotmail.com, google.com, yahoo.es, utp.edu.co)
	 * e imprima en la pantalla una dirección completa de correo electrónico
	 * que consista en las primeras dos letras del nombre, pegadas a las últimas dos letras del apellido arroba el dominio dado.
	 * P. ej.: el usuario digitó ‘césar’, ‘cabrera’, ‘hotmail.com’,
	 * el programa debe devolver ‘céra@hotmail.com’
	 */

	public static void main(String[] args) {
		try {
			Scanner leer = new Scanner(System.in);

			System.out.println("Ingrese el primer nombre");
			String nombre = leer.nextLine();

			System.out.println("Ingrese el primer apellido");
			String apellido = leer.nextLine();

			System.out.println("ngrese el dominio del correo electrónico");
			String dominio = leer.nextLine();

			nombre = nombre.substring(0, 2);
			apellido = apellido.substring(apellido.length() - 2);

			String correo = nombre + apellido + "@" + dominio;

			System.out.println(correo);

			leer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}