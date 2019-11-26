package unidad3;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		// Created by Luis Cortés
		// Date: 26-11-2019

		/*
		 * escribe un programa que simule el lanzamiento de un dado N veces, siendo N un
		 * número entero que se introducirá por teclado. El programa finalizará
		 * mostrando en la pantalla cuantas veces salió cada una de las caras.
		 */

		// la clase Random es la generara los numeros aleatorios

		Random r = new Random();

		// la clase scanner es la que nos permite crear un buffer para meter los datos
		// que introduzcamos por consola.

		Scanner input = new Scanner(System.in);

		// Vamos preguntar si el ususario quiere jugar y vamos a preguntarle hasta que
		// responda si o no, no puede introducir otro valor

		System.out.print("Hola, ¿Cuantas veces quieres tirar el dado?: ");

		// Vamos asignar el numero que introdujo el ususariario por consola sea N

		// la variable N va ser el numero de veces que el usuario diga que se tire el
		// dado

		int N = input.nextInt();

		/*
		 * Declaramos las variable de cada resultado posible en este momento como
		 * todavia no tiramos el dado todas tendrán valor cero
		 */

		int uno = 0;
		int dos = 0;
		int tres = 0;
		int cuatro = 0;
		int cinco = 0;
		int seis = 0;

		// Hacemos un bucle for que se repita tanta veces como tiradas N el usuario a
		// introduccido

		for (int x = 1; x <= N; x = x + 1) {

			// En esta parte el ordenador tiene que ir calculando valores aleatorios entre
			// el 1 y el 6 incluidos
			// del 1 al 6 son los numeros que tienen las caras de un dado

			// recordemos que randon con nextInt(N) calcula numero aletarorios entre 0 y N-1
			// como nosotros queremos numeros aleatorios del 1 a N, se pondremos 1 +
			// nextInt(N)

			// Declaramos numerosacado como el numero entre el 1 y 6 que ira saliendo en
			// cada tirada.

			int numerosacado = 1 + r.nextInt(6);

			// dependiendo el numero que salga en cada una de las tiradas
			// Sumaremos a las veces que salio ese numero en cada momento 1 unidad

			// utilizaremos un condicional if, se podría tambien utilizar un switch case

			if (numerosacado == 1) {
				uno = uno + 1;

			}

			else if (numerosacado == 2) {
				dos = dos + 1;

			}

			else if (numerosacado == 3) {
				tres = tres + 1;

			}

			else if (numerosacado == 4) {
				cuatro = cuatro + 1;

			}

			else if (numerosacado == 5) {
				cinco = cinco + 1;

			}

			else if (numerosacado == 6) {
				seis = seis + 1;

			}

		} // terminamos el bucle for que es cuando ya se realizaron todas las tiradas

		// Mostramos el resultado por panatalla

		System.out.println("");
		System.out.println("Se ha lanzado el dado " + N + " veces y han salido:");
		System.out.println("");
		System.out.println("El número uno: " + uno + " veces.");
		System.out.println("El número dos: " + dos + " veces.");
		System.out.println("El número tres: " + tres + " veces.");
		System.out.println("El número cuatro: " + cuatro + " veces.");
		System.out.println("El número cinco: " + cinco + " veces.");
		System.out.println("El número seis: " + seis + " veces.");

		System.out.println("");
		System.out.println("Muchas gracias por jugar, espero verte pronto.");

	}

}
