package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bisiesto {

	public static void main(String[] args) throws IOException {
	

		// Created by Luis Cortés
		// Date: 05-11-2019
				
		//Introducciendo un año por pantalla nos tiene que decir si es año bisiesto,
		
		//Sabremos si un año es bisiesto o no es bisiesto si o no cumple ciertas condiciones.
		
		
		System.out.println("Saber si un año introducido por pantalla es un año bisiesto\n");
		
		/*Esta vez en vez de utilizar la clase Scanner para introducir y capturar los datos de la consola
		*utilizaremos la clase BufferedReader
		*debemos importar los paquetes:
		
		*import java.io.BufferedReader;
		*import java.io.InputStreamReader;
		*/	
	    
		System.out.print("Por favor, introduzca un año: ");
		
		
		//Creamos un objeto de la clase BufferedReader, el cual guardara en buffer la entrada por consola
		
		// debemos importar
		//import java.io.IOException;
		
		
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		
		
		//Por la consola pedimos que se introduzca un año
		
		
		
		/*definimos la variable anio como tipo String debido,
		 *la declararemos mediante el metodo readline de que devuelve una String
		 *el cual lee la linea de los datos introduccido en la consola.
		 */
		
		String anio = in.readLine(); // la salida del metodo readLine es una String, se pone la excepcion throws IOException
		
	    //transformamos la cadena de texto anio (de readLine) a entero
		
		float anioV = Float.parseFloat (anio); //anio que es una cadena de texto lo convertimos a un numero deciamal anioV
		System.out.println();
		//una vez que tenemos el año (anioInt) como número entero vamos a aplicar los criterios condicionales para
		//saber si es un año es bisiesto o no.
		
		/*Los años bisiestos son los divisibles entre 4
		 	*excepto si es divisible entre 100, entonces no es bisiesto 
		 		*excepto si es divisible entre 400, entonces sí 
		 */
		
		
		/*Aplicamos un condicional:
		 * 
		 * Si el año (es multiplo de 4 y no es multiplo de 100) es año bisiesto
		 * 
		 * O
		 * 
		 * Si el año es multiplo de 100 y multiplo de 400 es año bisiesto
		 * 
		 * 
		 * 
		 * Sino el año No es año bisiesto
		 */
		
		
		if ((anioV%4 == 0 && anioV%100 != 0 ) || (anioV%100 == 0 && anioV%400 == 0)) {
			
			
			System.out.printf("El año %.0f es año bisiesto", anioV); 
				
		} else {
		
			System.out.printf("El año %.0f No es año bisiesto", anioV);

		}
	}
}