package jg.ejercicios.secuenciales;

import java.util.Scanner;

public class PuntoOcho {

	/**
	 * Haga un programa que solicite al usuario la cantidad de minutos invertidos en conexión a redes
	 * sociales durante el día de hoy. El programa debe calcular e imprimir la candidad de horas al mes que
	 * se han invertido en redes sociales. El cálculo consiste en multiplicar ese resultado por 30 días y
	 * divídalo por 60. Fórmula: horas_mes: minutos*30/60
	 */

	public static void main(String[] args) {
		try {
			Scanner leer = new Scanner(System.in);

			System.out.println("Ingrese la cantidad de minutos invertidos en redes sociales el día de hoy");
			Long minutos = Long.valueOf(leer.nextLine());

			long horasMes = minutos*30/60;

			System.out.println(horasMes);

			leer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
