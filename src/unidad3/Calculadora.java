package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//

		// Created by Luis Cort�s
		// Date: 13-11-2019

		/*
		 * Programa que al preguntar al usuario que tipo de operaci�n matematica desea
		 * realizar (+,-,x,/) e introducir dos n�meros, nos de el resultado de la
		 * operaci�n matematica selecionada entre los dos n�meros introducidos.
		 */

		// creamos el objeto input de la clase Scanner que leera y meter� en memoria los
		// datos
		// introducidos por la consola

		Scanner input = new Scanner(System.in);

		String jugar; // declaramos una variablde de tipo cadena de texto.

		do { /*
				 * vamos a repetir una secuencia (lo que hay entre este do hasta While) y
				 * mientras se siga siendo verdadera la concidici�n de While, En nuestro caso
				 * ser� mientras que el valor introducido por la consola, sera distinto a (+ - *
				 * / no) nos seguira pidiendo que introduzcamos una de estas opciones
				 */

			System.out.println(
					"Si desea Jugar, introduzca la operaci�n que desea realizar\n+ = sumar\n- = restar\n* = multiplicaci�n\n\\ = divisi�n\n\nEn el caso que no desee jugar introduzca: no\n\nIntroduzca una opci�n:");
			jugar = input.nextLine(); // jugar ya la habiamos declarado como tipo String y ahora le damos el valor
										// metido por pantalla.

		} while (!(jugar.equals("+") || jugar.equals("-") || jugar.equals("*") || jugar.equals("/")
				|| jugar.equals("no"))); // condici�n del while

		// Una vez introducido el valor correctamente, vamos ha hacer un bucle que se
		// ejecutar� mientras que el texto introducido por pantalla sea distinto a no
		// Dentro del bucle volveremos a preguntar por este valor, para poder salir de
		// �l cuando tome el valor no

		while (!jugar.contentEquals("no")) {

			// solicitamos los dos n�meros para realizar la operaci�n matematica

			System.out.print("\nIntroduzca el primer n�mero de la operaci�n a realizar:");
			float Numero1 = input.nextFloat();

			System.out.print("Introduzca el segundo n�mero de la operaci�n a realizar:");
			float Numero2 = input.nextFloat();

			// Ahora mediante condicionales en funci�n de la operaci�n introducida por
			// consola realizar� una u otra.

			// **Ojo preguntar si se puede hacer solo con una linea?. No se como meter el
			// simbolo de la operaci�n para que la haga, (es decir en la propia operaci�n entre los n�meros)
			// System.out.printf("\nEl resultado de la operaci�n %.2f "+ jugar +" %.2f =
			// %.2f", (float) Numero1,(float) Numero2, (float) (Numero1 ??No se como meter
			// jugar?? Numero2));

			if (jugar.equals("+")) {
				System.out.printf("\nEl resultado de la operaci�n %.2f + %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 + Numero2));

			} else if (jugar.equals("-")) {
				System.out.printf("\nEl resultado de la operaci�n %.2f - %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 - Numero2));

			} else if (jugar.equals("*")) {
				System.out.printf("\nEl resultado de la operaci�n %.2f * %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 * Numero2));
				// Si la opraci�n matematica ni es / ni es - ni es *, por descarte queda la
				// divisi�n /
			} else {
				System.out.printf("\nEl resultado de la operaci�n %.2f / %.2f = %.2f", (float) Numero1, (float) Numero2,
						(float) (Numero1 / Numero2));
			}
			// volvemos a preguntar (recordemos que estamos todavia dentro del While y desde
			// aqu� nos pregunta otra vez
			// Si contestamos que no, ya no se cumple la condici�n del while y sale del
			// bucle, en caso contrario vuelve a repetir la operaci�n introduccida
			do {
				System.out.println(
						"\n\nSi desea Jugar otra vez, introduzca la operaci�n que desea realizar\n+ = sumar\n- = restar\n* = multiplicaci�n\n\\ = divisi�n\n\nEn el caso que no desee jugar introduzca: no\n\nIntroduzca una opci�n:");
				jugar = input.nextLine(); // jugar ya la habiamos declarado como tipo String y ahora le damos el valor
				// metido por pantalla.
			} while (!(jugar.equals("+") || jugar.equals("-") || jugar.equals("*") || jugar.equals("/")
					|| jugar.equals("no")));

		} // cerramos el While es decir lo introducido por consola fue no

		// Mensaje de finalizaci�n
		System.out.println("Muchas gracias, espero volver a verle pronto.");
		input.close();
	}
}
