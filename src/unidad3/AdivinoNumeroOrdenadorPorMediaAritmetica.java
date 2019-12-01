package unidad3;

import java.util.Scanner;

public class AdivinoNumeroOrdenadorPorMediaAritmetica {

	public static void main(String[] args) {

		// Created by Luis Cortés
		// Date: 30-11-2019

		/*
		 * Nosotros pensamos un número entero El ordenador nos pide un número mayor al
		 * que pensamos Lo cual el número que pensamos estará entre 1 y el limte que le
		 * dijimos El ordenador sabiendo el rango superior e inferior, ira enseñando por
		 * consola la media aritmetica de los número entre los limites superior e
		 * inferior. Esta media aritmetica la calcularemos como la suma de el limite
		 * inferior + (la diferencia entre el limite superior - el inferior)/2 Y
		 * nosotros repdonderemos aierto , mayor o menor (estos dos ultimos casos El
		 * ordenador seguira diciendo números hasta que acierte es decir respondemos
		 * acierto Si al ordenador le mentimos cuando le respondemos, entonces nos dirá
		 * que hemos mentido y nos volvera a preguntar El ordenador sabrá que le
		 * mentimos cuando (la diferencia entre el limite superior - el inferior)/2 sea
		 * menor o igual a 0, en
		 */

		Scanner input = new Scanner(System.in);

		String jugar; // declaramos la variable jugar que es la que va a coger valor de que si
						// queremos jugar o no

		// Vamos preguntar si el ususario quiere jugar y vamos a preguntarle hasta que
		// responda si o no, no puede introducir otro valor

		// vamos ha hacer un bucle do while hasta que el la respuesta del usuario no sea
		// o si o no
		do {
			System.out.print("¿Quieres jugar a que te adivine un número que pienses? (si/no)");

			jugar = input.nextLine();// jugar toma el valor introducido por el usuario por la consola, recordemos que
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

		while (jugar.equals("si")) {

			int limiteInf = 0; // en principio este limite superior es 0
			int limiteSup; // en principio se lo pediremos al usuario

			int diferencia;// Es igual al limite Sup - LimiteInf

			int pensado;// Este es el supuesto numero pensado por el humano

			String respuesta;// Es la respuesta que vamos a decir al ordenador

			String respuestaacertada = "no"; // Es la variable que nos va decir si acerto por decir "acierto" o porque ya
												// no hay más posibililades y nos engañan
			
			System.out.print("\nPiensa un número.\nDime un número mayor al que pensaste: ");

			limiteSup = input.nextInt();
			input.nextLine();// vacio el salto de carro que pudo quedar en el input.nextInt
			
			do {

				diferencia = limiteSup - limiteInf;

				// System.out.println("LA diferenecia = " + diferencia);
				// System.out.println("LA diferenecia entre 2 = " + (diferencia / 2));

				System.out.println("Es el número " + (limiteInf + (diferencia / 2)) + " el que pensaste?");
				System.out.print("Es mayor, menor o acierto)? :");

				respuesta = input.nextLine();

				if (respuesta.equals("mayor")) {

					if (limiteInf + 2 >= limiteSup) {
						System.out.print("Me estas engañando. el número que pensastes es el "
								+ (limiteInf + (diferencia / 2)) + "\n");
						respuestaacertada = "si";
					} else {
						limiteInf = (limiteInf + (diferencia / 2));
					}
				} else if (respuesta.equals("menor")) {
					if (limiteInf + 2 >= limiteSup) {
						System.out.print("Me estas engañando. el número que pensastes es el "
								+ (limiteInf + (diferencia / 2)) + "\n");
						respuestaacertada = "si";
					} else {
						limiteSup = (limiteInf + (diferencia / 2));
					}
				}

				else if (respuesta.equals("acierto")) {

					System.out.print("Fantastico. He acertado");
					respuestaacertada = "si";
				}

			} while (!(respuestaacertada.equals("si")));

			do {
				System.out.println("\n¿Quieres jugar otra vez? (si/no)");

				jugar = input.next();// jugar toma el valor introducido por el usuario por la consola, recordemos que
										// jugar es una String

				// Si la respuesta no es igual a si y no es igual a no entonces la consola nos
				// dice que la respuesta es incorrecta.

				if (!jugar.equals("si") && !jugar.equals("no"))
					System.out.println("Respuesta incorrecta");
			} while (!(jugar.equals("si") || jugar.equals("no")));

		}

		System.out.println("Gracias, nos vemos pronto.");
	}

}
