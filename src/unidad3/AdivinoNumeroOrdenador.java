package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinoNumeroOrdenador {

	public static void main(String[] args) {

		// Created by Luis Cortés
		// Date: 16-11-2019

		/*
		 * Nosotros pensamos un número entero El ordenador nos pide un número mayor al
		 * que pensamos Lo cual el número que pensamos estará entre 1 y el limte que le
		 * dijimos El ordenador sabiendo el rango superior e inferior, ira enseñando por
		 * consola números aletorios dentro de ese rango. Y nosotros repdonderemos
		 * acierto , mayor o menor (estos dos ultimos casos El ordenador seguira
		 * diciendo números hasta que acierte es decir respondemos acierto Si al
		 * ordenador le mentimos cuando le respondemos, entonces nos dirá que hemos
		 * mentido y nos volvera a preguntar
		 */

		// la clase Random es la generara los numeros aleatorios

		Random r = new Random();

		// la clase scanner es la que nos permite crear un buffer para meter los datos
		// que introduzcamos por consola.

		Scanner input = new Scanner(System.in);

		String jugar; // declaramos la variable jugar que es la que va a coger valor de que si
						// queremos jugar o no

		// Vamos preguntar si el ususario quiere jugar y vamos a preguntarle hasta que
		// responda si o no, no puede introducir otro valor

		// vamos ha hacer un bucle do while hasta que el la respuesta del usuario no sea
		// o si o no
		do {
			System.out.println("¿Quieres jugar a adivinar un número? (si/no)");

			jugar = input.next();// jugar toma el valor introducido por el usuario por la consola, recordemos que
									// jugar es una String

			// Si la respuesta no es igual a si y no es igual a no entonces la consola nos
			// dice que la respuesta es incorrecta.

			if (!jugar.equals("si") && !jugar.equals("no"))
				System.out.println("Respuesta incorrecta");
		} while (!(jugar.equals("si") || jugar.equals("no"))); // while repite la pregunta hasta que la respuesta no sea
																// igual ni a si o a no

		// si la respuesta es si y mientras que mantenga como si cuando nos vuelva a
		// preguntar dentro de un bucle vamos a seguir jugando ejecutar el juego

		// las sentencias dentro del bucle while se ejecutarn mientras jugar sea igual a
		// si

		// while (jugar.equals("si")) {

		int max; /*
					 * definimos una variable entera que será el primer numero superior que nos
					 * pregunte y que ira cambiando si decimos que un numero es menor
					 */

		System.out.print("\nPiensa un número mayor que 0.\nDime un número MAYOR al que pensaste: ");

		max = input.nextInt();//

		System.out.println("\nEl número que pensaste está entre 0 y " + max);

		int maxv = max; // este será el número aleatorio maximo del rango que ira cada tomado vez que
						// contestemos

		int minv = 1;// este será el número mínimo del rango que ira tomando cada vez que contestemos

		int Nadivino;

		int Rsuperior = r.nextInt(maxv - minv);

		Nadivino = minv + Rsuperior;

		String respuesta; // la respuesta del usuario solo puede ser acierto, mayor o menor
		do {

			String enganas = "No";// Si me engaña

			do {

				// System.out.println("\nNadivino antes de adivinar =" + Nadivino + " minv= " +
				// minv + " maxv= " + maxv + " Rsuperior= " + Rsuperior);

				System.out.println("\n*Creo que el número que pensaste es el " + Nadivino);

				// System.out.println("\nNadivino despues de adivinar =" + Nadivino + " minv= "
				// + minv + " maxv= " + maxv + " Rsuperior= " + Rsuperior);

				System.out.println("\nSi acerte escribe: acierto");
				System.out.println("Si es mayor escribe: mayor");
				System.out.println("Si es menor escribe: menor");

				System.out.print("\n¿Cual es tu respuesta? :");
				respuesta = input.next();

				if (!respuesta.equals("acierto") && !respuesta.equals("mayor") && !respuesta.equals("menor")) {

					System.out.println("\nNo escribiste bien tu respuesta");
				}

				if ((respuesta.equals("menor") || respuesta.equals("mayor"))
						&& ((Nadivino == maxv - 1) && (Nadivino == minv))) {

					System.out.println("\nMe estas engañando el numero " + Nadivino
							+ " es el que habías pensado. deberias haber contestado: acierto");
					enganas = ("no");
					respuesta = ("acierto");
				} else {

					if (respuesta.equals("mayor") && Nadivino + 1 == maxv) {
						System.out.println(
								"\n*Me estas engañando el número que pensaste no puede ser superior a " + Nadivino);
						enganas = ("si");

					}

					else if (respuesta.equals("menor") && Nadivino <= minv) {
						System.out.println(
								"\n*Me estas engañando el número que pensaste no puede ser inferior a " + minv);
						enganas = ("si");
					}

				}

			} while ((!(respuesta.equals("acierto") || respuesta.equals("mayor") || respuesta.equals("menor"))
					|| enganas.equals("si")));

			if (respuesta.equals("mayor")) {
				minv = Nadivino + 1;

				Rsuperior = r.nextInt(maxv - minv);
				Nadivino = minv + Rsuperior;

				// System.out.println("\nNadivino despues de mayor ok=" + Nadivino + " minv= " +
				// minv + " maxv= " + maxv + " Rsuperior= " + Rsuperior);
			}

			else if (respuesta.equals("menor")) {
				maxv = Nadivino;

				Rsuperior = r.nextInt(maxv - minv);
				Nadivino = minv + Rsuperior;
				// System.out.println("\nNadivino despues de menor ok=" + Nadivino + " minv= " +
				// minv + " maxv= " + maxv + " Rsuperior= " + Rsuperior);
			}

		} while (!(respuesta.equals("acierto")));

		System.out.println("\nHe acertado el número que pensaste, era el " + Nadivino);

		input.close(); // cerramos Scanner

	}

}
