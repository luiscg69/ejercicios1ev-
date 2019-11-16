package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		// Created by Luis Cortés
		// Date: 16-11-2019

		/*
		 * El ordenador genera un numero de aleatorio entre 1 y N ambos incluidos.
		 * Siendo N otro número aleatorio que genere el ordenador mayor o igual a 1000 y menor o igual a 100.000
		 * El ordenador nos pregunta que nuemero creemos que fue el que penso entre 1 y N
		 * Introducidos el numero que creeemos que penso y nos dira si es menor o menor al numero N o si se ha acertado
		 * Nos deja meter numeros hasta que acertemos el valor del número
		 *  
		 */

				
		// la clase Random es la generara los numeros aleatorios
		
		Random r = new Random();
		
		//  la clase scanner es la que nos permite crear un buffer para meter los datos que introduzcamos por consola.
		
		Scanner input = new Scanner(System.in);
		
		
		String jugar; //declaramos la variable jugar que es la que va a coger valor de que si queremos jugar o no
		
		// Vamos preguntar si el ususario quiere jugar y vamos a preguntarle hasta que responda si o no, no puede introducir otro valor
		
		// vamos ha hacer un bucle do while hasta que el la respuesta del usuario no sea o si o no
		do {
			System.out.println("¿Quieres jugar a adivinar un número? (si/no)");
			
			jugar = input.nextLine();// jugar toma el valor introduccio por el usuario por la consola, recordemos que jugar es una String 
			
			// Si la respuesta no es igual a si y no es igual a no entonces la consola nos dice que la respuest es incorrecta
			if (!jugar.equals("si") && !jugar.equals("no"))
				System.out.println("Respuesta incorrecta");
		} while (!(jugar.equals("si") || jugar.equals("no"))); // while repite la pregunta hasta que la respuesta no sea igual ni a si o a no
		
		// si la respuesta es si y mientras que mantenga como si cuando nos vuelva a preguntar den tro de un bucle vamos a ejecutar el juego 
		
		// las sentencias dentro del bucle while se ejecutarn mientras jugar sea igual a si 
		
		while (jugar.equals("si")) {
			int max; // definimos una variable entera que será el primer numero aleatorio entre 1000 y 100.000
						
			max =1000 + r.nextInt(99001);   /*nextInt(numero) dentro de la clase Random nos da un numero aleatorio entre 0 y el numero entre parentisis menos 1
			 							    * Necesitamos un numero aleatorio entre 1.000 y 100.000 incluidos
			 							    * Sabemos que si hacemos un Random nos va a generar numeros del 0 al numero que digamos menos 1
			 							    * El numero minimo aleatorio debe ser 1000 por lo tanto a este le tendremos que sumar numeros aleatorios entre 0 y 99.000
			 							    * Porque si 1000 le sumamos 0, será 1000 y si a 1000 le sumamos 99.000 sera 100.000, pero nextInt(numero) nos dará un numero menos le tendremos que poner 99.001  
			 							    */
			
			int n; // definimos una variable entera n que será el numero aleatorio entre 1 y el numero aletorio max calculado anteriormente 
			
			n =  1 + r.nextInt(max); /* como el Ramdon con nextInt(numero) va desde 0 al numero menos 1, el minimo que necesitamos es 1 y el maximo el max calculado
									 entoces n sera 1 más un numero aletatorio entre 0 y el numero maximo menos 1
									*/
			int nu; // declaramos una varible entera que será el número que va ser el número que introduzcamos mediante la clase Scanner 
									
			// vamos hacer un bucle do while que mientras el numero introducido por el ususario no sea igual al que penso el ordenador nos siga preguntando
			
			do {
				System.out.printf("¿Qué número estoy pensando entre 1 y %d? ", max); // Nos pregunta que numero ha pensado el ordenador entre 1 y max que es el primer aleatorio
				nu = input.nextInt(); // valor del numero entero introducido por el usuario 
				
				// hacemos un condicional si el segundo numero aleatorio n es mayor al introducido o  el numero aleatorio n es menor nos lo diga
				
				if (n > nu)
					System.out.println("El número que estoy pensando es mayor");
				else if (n < nu)
					System.out.println("El número que estoy pensando es menor");
				
			} while (n != nu); // while mientras el número aleatorio sea distinro al introducido
			
			// una vez acertado el numero, nos lo comunica y nos pregunta 
			// recordemos que todavia estamos del while que se ejecutara mientras jugar es Si
			System.out.println("Felicidades, has acertado. ¿Quieres jugar otra vez? (si/no)");
			jugar = input.next();
		
		}// Cerramos el while que se saldra de el cuando el usuario diga algo distinto a si,  a la pregunta de si quiere jugar  
	
	  // el usuario respondio que no queria jugar en un principio o salio del bucle while respondiendo que no queria seguir jugando	
	 
		System.out.println("Muchas gracias, espero verle pronto.");
	
	input.close(); //cerramos Scanner
	}

}

		
		

	
