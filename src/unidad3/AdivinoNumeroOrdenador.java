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

		System.out.print("\nPiensa un número.\nDime un número mayor o igual al que pensaste: ");

		max = input.nextInt();// En este momento el número pensado tiene que estar entre 1 y el número max
								// (incluidos)

		System.out.println("\nEl número que pensaste está entre 1 y " + max);

		int pensado;// este será el numero pensado

		int maxv = max; // este será el número aleatorio maximo del rango que ira cada tomado vez que
						// contestemos

		int minv = 1;// este será el número mínimo del rango que ira tomando cada vez que contestemos

		// queremos jugar o no
		// Vamos ha hacer un do while mientras

		// como

		int Nadivino;

        int Rsuperior = r.nextInt(maxv + 1 - minv);	
		
		Nadivino = minv + Rsuperior;/*
											 * Numero que calcula el ordenador dentro del rango
											 * 
											 * 
											 * El ordenador nos tiene que dar un número aleatorio entre 1 y
											 * nextInt(numero) dentro de la clase Random nos da un numero aleatorio
											 * entre 0 y el numero entre parentisis menos 1 Necesitamos un numero
											 * aleatorio entre 1.000 y 100.000 incluidos Sabemos que si hacemos un
											 * Random nos va a generar numeros del 0 al numero que digamos menos 1 El
											 * numero minimo aleatorio debe ser 1000 por lo tanto a este le tendremos
											 * que sumar numeros aleatorios entre 0 y 99.000 Porque si 1000 le sumamos
											 * 0, será 1000 y si a 1000 le sumamos 99.000 sera 100.000, pero
											 * nextInt(numero) nos dará un numero menos le tendremos que poner 99.001
											 */
		String respuesta; // la respuesta del usuario solo puede ser acierto, mayor o menor
		do {

		
		String enganas ="No";// Si me engaña
		
		do {
			
			
			
			
			
			
			System.out.println(Nadivino + " " + minv + " " + maxv +" "+Rsuperior);

			System.out.println("\nCreo que el número que pensaste es el " + Nadivino);

			System.out.println("\nSi acerte escribe: acierto");
			System.out.println("Si es mayor escribe: mayor");
			System.out.println("Si es menor escribe: menor");

			System.out.print("\n¿Cual es tu respuesta? :");
			respuesta = input.next();

			if (!respuesta.equals("acierto") && !respuesta.equals("mayor") && !respuesta.equals("menor")) {
				
			System.out.println("No escribiste bien tu respuesta");
			}
		

		
		if (respuesta.equals ("mayor") && Nadivino == Rsuperior) {
		System.out.println("Me estas engañando el número que pensaste no puede ser superior a"+ Rsuperior);
		 enganas = ("si"); 
		}
		
		if (respuesta.equals ("menor") && Nadivino == minv) {
			System.out.println("Me estas engañando el número que pensaste no puede ser inferior a"+ minv);
			enganas = ("si"); 
		}
		
				
		} while ((!( respuesta.equals("acierto") || respuesta.equals("mayor") || respuesta.equals("menor")) || enganas.equals("si")));	
			
		
		if (respuesta.equals("mayor")){
			minv = Nadivino;
			
			Rsuperior = r.nextInt(maxv + 1 - minv);	
			Nadivino = minv + Rsuperior;
												 
		}
		
		if (respuesta.equals("menor")){
			maxv = Nadivino;
		    
		    Rsuperior = r.nextInt(maxv + 1 - minv);	
			Nadivino = minv + Rsuperior;
		
		}
		
	} while (!(respuesta.equals("acierto")));	
		
		System.out.println("he acertado el número que pensaste era el "+ respuesta);
		
		//respuesta.equals("acierto") ||
			
		// } while (!(respuesta.equals ("acierto")));

		/*
		 * 
		 * int n; // definimos una variable entera n que será el numero aleatorio entre
		 * 1 y el // numero aletorio max calculado anteriormente
		 * 
		 * n = 1 + r.nextInt(max); como el Ramdon con nextInt(numero) va desde 0 al
		 * numero menos 1, el minimo que necesitamos es 1 y el maximo el max calculado
		 * entoces n sera 1 más un numero aletatorio entre 0 y el numero maximo menos 1
		 * 
		 * int nu; // declaramos una varible entera que será el número que va ser el
		 * número que // introduzcamos mediante la clase Scanner
		 * 
		 * // vamos hacer un bucle do while que mientras el numero introducido por el //
		 * ususario no sea igual al que penso el ordenador nos siga preguntando
		 * 
		 * do { System.out.printf("¿Qué número estoy pensando entre 1 y %d? ", max); //
		 * Nos pregunta que numero ha // pensado el ordenador entre 1 // y max que es el
		 * primer // aleatorio nu = input.nextInt(); // valor del numero entero
		 * introducido por el usuario
		 * 
		 * // hacemos un condicional si el segundo numero aleatorio n es mayor al //
		 * introducido o el numero aleatorio n es menor nos lo diga
		 * 
		 * if (n > nu) System.out.println("El número que estoy pensando es mayor"); else
		 * if (n < nu) System.out.println("El número que estoy pensando es menor");
		 * 
		 * } while (n != nu); // while mientras el número aleatorio sea distinro al
		 * introducido
		 * 
		 * // una vez acertado el numero, nos lo comunica y nos pregunta // recordemos
		 * que todavia estamos del while que se ejecutara mientras jugar es // Si
		 * System.out.
		 * println("Felicidades, has acertado. ¿Quieres jugar otra vez? (si/no)"); jugar
		 * = input.next();
		 * 
		 * } // Cerramos el while que se saldra de el cuando el usuario diga algo
		 * distinto a // si, a la pregunta de si quiere jugar
		 * 
		 * // el usuario respondio que no queria jugar en un principio o salio del bucle
		 * // while respondiendo que no queria seguir jugando
		 * 
		 * System.out.println("Muchas gracias, espero verle pronto.");
		 * 
		 * input.close(); // cerramos Scanner
		 * 
		 */
	}

	
}
