package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bisiesto {

	public static void main(String[] args) throws IOException {
	

		// Created by Luis Cort�s
		// Date: 05-11-2019
				
		//Introducciendo un a�o por pantalla nos tiene que decir si es a�o bisiesto,
		
		//Sabremos si un a�o es bisiesto o no es bisiesto si o no cumple ciertas condiciones.
		
		
		System.out.println("Saber si un a�o introducido por pantalla es un a�o bisiesto\n");
		
		/*Esta vez en vez de utilizar la clase Scanner para introducir y capturar los datos de la consola
		*utilizaremos la clase BufferedReader
		*debemos importar los paquetes:
		
		*import java.io.BufferedReader;
		*import java.io.InputStreamReader;
		*/	
	    
		System.out.print("Por favor, introduzca un a�o: ");
		
		
		//Creamos un objeto de la clase BufferedReader, el cual guardara en buffer la entrada por consola
		
		// debemos importar
		//import java.io.IOException;
		
		
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		
		//Por la consola pedimos que se introduzca un a�o
		
		
		
		/*definimos la variable anio como tipo String debido,
		 *la declararemos mediante el metodo readline de que devuelve una String
		 *el cual lee la linea de los datos introduccido en la consola.
		 */
		
		String anio = in.readLine(); // la salida del metodo readLine es una String, se pone la excepcion throws IOException
		
	    //transformamos la cadena de texto anio (de readLine) a entero
		
		float anioV = Float.parseFloat (anio); //anio que es una cadena de texto lo convertimos a un numero deciamal anioV
		System.out.println();
		//una vez que tenemos el a�o (anioInt) como n�mero entero vamos a aplicar los criterios condicionales para
		//saber si es un a�o es bisiesto o no.
		
		/*Los a�os bisiestos son los divisibles entre 4
		 	*excepto si es divisible entre 100, entonces no es bisiesto 
		 		*excepto si es divisible entre 400, entonces s� 
		 */
		
		
		/*Aplicamos un condicional:
		 * 
		 * Si el a�o (es multiplo de 4 y no es multiplo de 100) es a�o bisiesto
		 * 
		 * O
		 * 
		 * Si el a�o es multiplo de 100 y multiplo de 400 es a�o bisiesto
		 * 
		 * 
		 * 
		 * Sino el a�o No es a�o bisiesto
		 */
		
		
		if ((anioV%4 == 0 && anioV%100 != 0 ) || (anioV%100 == 0 && anioV%400 == 0)) {
			
			
			System.out.printf("El a�o %.0f es a�o bisiesto", anioV); 
				
		} else {
		
			System.out.printf("El a�o %.0f No es a�o bisiesto", anioV);

		}
	}
}