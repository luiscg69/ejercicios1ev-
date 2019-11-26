package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {

		// Created by Luis Cort�s
		// Date: 16-11-2019

		/*
		 * En el m�todo main de una clase llamada TrianguloFloyd escribe un programa que
		 * genere �l triangulo de Floyd para un n�mero de filas que introduciremos por
		 * teclado y lo muestre por pantalla. Por ejemplo, si el n�mero de filas es 4 el
		 * tri�ngulo de Floyd ser�:
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 */

		// la clase scanner es la que nos permite crear un buffer para meter los datos
		// que introduzcamos por consola

		Scanner input = new Scanner(System.in);

		// declaro ncolumnas que ser�n las columnas que nos introduce el usuario
		int ncolumnas;

		// declaro nnumero y lo inicio con valor 1 a los numeros que tiene que ir
		// poniendo en la secuencia
		int nnumero = 1;

		// Pregunto el n�mero de columnas quiere el usuario que tenga el triangulo

		System.out.print("�Cuantas columnas quieres que tenga tu triangulo de Floyd?: ");

		// ncolumnas va tomar el valor de columnas introducido por el usuario
		ncolumnas = input.nextInt();

		// hacemos un bucle para las columnas, donde la variable x tomando valor desde 1
		// hasta el numero de columnas introducido por el usuario
		// incrementando en 1 su valor cada vez que se ejecute el bucle

		for (int x = 1; x <= ncolumnas; x = x + 1) {

			// introducimos un salto de linea para cuando se incremente el numero de
			// columna, salte una linea
			System.out.println();

			// hacemos otro bucle que se ejecutar� cada vez dentro de cada fila en la que
			// estemos
			// El numero de nummeros de cada linea empezar� en 1 n�mero hasta el n�mero de
			// columna que estemos
			// El numero de columna en la que estemos ser� el valor que va tomando x

			// Se ejecutar� el bucle desde y = 1 incrementando en 1 hasta llegar al mismo
			// numero de columna en cada momento que es x
			// El n�meros que tiene cada columna, es precisamente el n�mero de su columna

			for (int y = 1; y <= x; y = y + 1) {

				// en cada linea imprimimos el valor que va teniendo nnumero en cada momento y
				// le ponemos un espacio detr�s
				// fuera de los dos bubles habiamos dado valor a nnumero = 1
				System.out.print(nnumero + " ");

				// cada vez que se ejecute este bucle nnumero se incrementar� en 1 al valor que
				// tenia que es que salio por pantalla
				nnumero = nnumero + 1;

			} // cerramos el bucle de fila

		} // cerramos el bucle de columnas
		input.close();
	}

}
