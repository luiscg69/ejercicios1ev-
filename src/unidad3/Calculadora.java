package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//

		// Created by Luis Cortés
		// Date: 13-11-2019

		/*
		 * Programa que al preguntar al usuario que tipo de operación matematica desea
		 * realizar (+,-,x,/) e introducir dos números, nos de el resultado de la
		 * operación matematica selecionada entre los dos números introducidos.
		 */

		// creamos el objeto input de la clase Scanner que leera y meterá en memoria los
		// datos
		// introducidos por la consola

		Scanner input = new Scanner(System.in);

		String jugar; // declaramos una variablde de tipo cadena de texto.

		do { /*
				 * vamos a repetir una secuencia (lo que hay entre este do hasta While) y
				 * mientras se siga siendo verdadera la concidición de While, En nuestro caso
				 * será mientras que el valor introducido por la consola, sera distinto a (+ - *
				 * / no) nos seguira pidiendo que introduzcamos una de estas opciones
				 */

			System.out.println(
					"Si desea Jugar, introduzca la operación que desea realizar\n+ = sumar\n- = restar\n* = multiplicación\n\\ = división\n\nEn el caso que no desee jugar introduzca: no\n\nIntroduzca una opción:");
			jugar = input.nextLine(); // jugar ya la habiamos declarado como tipo String y ahora le damos el valor
										// metido por pantalla.

		} while (!(jugar.equals("+") || jugar.equals("-") || jugar.equals("*") || jugar.equals("/")
				|| jugar.equals("no"))); // condición del while

		// Una vez introducido el valor correctamente, vamos ha hacer un bucle que se
		// ejecutará mientras que el texto introducido por pantalla sea distinto a no
		// Dentro del bucle volveremos a preguntar por este valor, para poder salir de
		// él cuando tome el valor no

		while (!jugar.contentEquals("no")) {

			// solicitamos los dos números para realizar la operación matematica

			System.out.print("\nIntroduzca el primer número de la operación a realizar:");
			float Numero1 = input.nextFloat();

			System.out.print("Introduzca el segundo número de la operación a realizar:");
			float Numero2 = input.nextFloat();

			// Ahora mediante condicionales en función de la operación introducida por
			// consola realizará una u otra.

			// **Ojo preguntar si se puede hacer solo con una linea?. No se como meter el
			// simbolo de la operación para que la haga, (es decir en la propia operación entre los números)
			// System.out.printf("\nEl resultado de la operación %.2f "+ jugar +" %.2f =
			// %.2f", (float) Numero1,(float) Numero2, (float) (Numero1 ??No se como meter
			// jugar?? Numero2));

			if (jugar.equals("+")) {
				System.out.printf("\nEl resultado de la operación %.2f + %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 + Numero2));

			} else if (jugar.equals("-")) {
				System.out.printf("\nEl resultado de la operación %.2f - %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 - Numero2));

			} else if (jugar.equals("*")) {
				System.out.printf("\nEl resultado de la operación %.2f * %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 * Numero2));
				// Si la opración matematica ni es / ni es - ni es *, por descarte queda la
				// división /
			} else {
				System.out.printf("\nEl resultado de la operación %.2f / %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 / Numero2));
			}
			// volvemos a preguntar (recordemos que estamos todavia dentro del While y desde
			// aquí nos pregunta otra vez
			// Si contestamos que no, ya no se cumple la condición del while y sale del
			// bucle, en caso contrario vuelve a repetir la operación introduccida
			do {
				System.out.println(
						"\n\nSi desea Jugar otra vez, introduzca la operación que desea realizar\n+ = sumar\n- = restar\n* = multiplicación\n\\ = división\n\nEn el caso que no desee jugar introduzca: no\n\nIntroduzca una opción:");
				jugar = input.nextLine(); // jugar ya la habiamos declarado como tipo String y ahora le damos el valor
				// metido por pantalla.
			} while (!(jugar.equals("+") || jugar.equals("-") || jugar.equals("*") || jugar.equals("/")
					|| jugar.equals("no")));

		} // cerramos el While es decir lo introducido por consola fue no

		// Mensaje de finalización
		System.out.println("Muchas gracias, espero volver a verle pronto.");
		input.close();
	}
}
