package jg.ejercicios.secuenciales;

import java.util.Scanner;

public class PuntoSeisYSiete {

	/**
	 * PUNTO 6
	 * Haga un programa que calcule el peso ideal de un hombre menor de 30 años con la fórmula:
	 * estatura-100. La estatura debe ser dada en centímetros, el resultado de la fórmula es en libras,
	 * dividirlo por dos y dar el resultado en Kg. Nota: la fórmula es sólo un ejemplo,
	 * no es la forma en que se calcula el peso ideal.
	 */

	/**
	 * PUNTO 7
	 * Haga un programa que calcule el peso ideal de una mujer menor de 30 años con la fórmula:
	 * estatura-110. La estatura debe ser dada en centímetros, el resultado de la fórmula es en libras,
	 * dividirlo por dos y dar el resultado en Kg. Nota: la fórmula es sólo un ejemplo,
	 * no es la forma en que se calcula el peso ideal.
	 */

	public static void main(String[] args) {
		try {

			Scanner leer = new Scanner(System.in);

			System.out.println("Ingrese la edad");
			int edad = Integer.parseInt(leer.nextLine());

			if (edad < 30) {

				System.out.println("Ingrese el genero (Hombre, Mujer)");
				String genero = leer.nextLine();

				if (genero.equalsIgnoreCase("hombre")) {

					System.out.println("Ingrese la estatura en centímetros");
					int estatura = leer.nextInt();

					int resultado = (estatura - 100)/2;

					System.out.println("El peso ideal es: " + resultado + " Kg");
				} else if (genero.equalsIgnoreCase("mujer")) {

					System.out.println("Ingrese la estatura en centímetros");
					int estatura = leer.nextInt();

					int resultado = (estatura - 110)/2;

					System.out.println("El peso ideal es: " + resultado + " Kg");
				}
			}

			leer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
