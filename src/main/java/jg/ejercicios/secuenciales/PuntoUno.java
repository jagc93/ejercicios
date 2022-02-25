package jg.ejercicios.secuenciales;

import java.util.Scanner;

public class PuntoUno {

	/************************************************************************************
	 * Haga un programa que solicite el nombre del usuario y lo salude por el nombre	*
	 ************************************************************************************/

	public static void main(String[] args) {
		try {
			Scanner leer = new Scanner (System.in);
			System.out.println("Ingrese el nombre del usuario");
			String nombre = leer.nextLine();

			System.out.println("Hola " + nombre);

			leer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
