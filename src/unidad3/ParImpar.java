package unidad3;

import java.util.Scanner;

public class ParImpar {

	/*  Saber si un n�mero introducido por la consola es par o impar
	 *  Created by Luis Cort�s
	  * Date 04-11-2019
	
	* Podremos resolverlo de dos formas:
	* 
	* 	1) Al n�mero introducido por consola lo dividimos entre dos (2),
           Hacemos la divi�n y tomamos la parte entera de la divisi�n
		   Hacemos la divisi�n teniendo en cuenta los decimales.
		   Posteriormente si restamos de la divisi�n decimal la divisi�n entera.
		    	Si la resta es 0 el n�mero es par (no tiene resto)
		    	Si la resta no es 0 el n�mero es impar (la divisi�n decimal no es exacta)
		    	
		    	
		 2) Otra forma m�s sencilla es directamente valorar el resto de la divi�n entre 2,
		    Si el resto es 0, el n�mero es par
		    Si el resto no es 0 (tiene resto), el n�mero es Impar
		   
		   	 	
	*
	*
	*/

	public static void main(String[] args)  {
		
		// METODO 1
		// Creamos el objeto input de la clase Scanner el cual guardara en buffer lo que introduzca por la consola 
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Saber si un N�mero es Par o Impar Metodo 1\n" );
		
		
		// Solicitamos el n�mero entero en la consola
		System.out.print("Introduzca un n�mero entero: " );
		
		// a una variable tipo entera le asignamos el valor introducido  en consola a traves del Objeto input de la clase Scanner
		int InputNumero =  input.nextInt();
		
		// a una  variable tipo entera le asignamos el valor de la division del numero introducido y el numero 2 (estos dos numeros son enteros)
		
		int DivisionDosInt = (InputNumero/2);
		
				
		// a una variable tipo double(decimal) le asignamos el valor de la divi�n del n�mero introducido convirtiendolo en decimal entre 2 decimal
		
		double DisionDosDecimal = (double) ((double) InputNumero / 2);
		
					
		// a una variable decimal le asignamos el valor de la resta de la parte decimal menos la entera 
		
		double resta = DisionDosDecimal-DivisionDosInt;
		
				
			//Realizamos un condicional de tal manera de que si la resta es 0 el n�mero es par, y sino el Impar
		
			if (resta == 0) {
				
				System.out.println("El Numero " + InputNumero + " es un numero Par\n");
			} 
			
			else  {
			
				System.out.println("El Numero " + InputNumero + " es un numero Impar\n");
			} 	
				
		// Fin Metodo 1	
			
			
			// METODO 2
			
		System.out.println("Saber si un N�mero es Par o Impar Metodo 2\n" );
			
			
		// Solicitamos el n�mero entero en la consola
		System.out.print("Introduzca un n�mero entero: " );
			
		// a una variable tipo entera le asignamos el valor introducido  en consola a traves del Objeto input de la clase Scanner
		int InputNumero2 =  input.nextInt();
			
			
			//Realizamos un condicional de tal manera de que si la resta es 0 el n�mero es par, y sino el Impar
			
			if (InputNumero2%2 == 0) {
				
				System.out.println("El Numero " + InputNumero + " es un numero Par\n");
			} 
			
			else  {
				
				System.out.println("El Numero " + InputNumero + " es un numero Impar\n");
			} 
			
			//Vaciamos Scanner
			
			
			input.close();
		// Fin Metodo 2	
		
			
				
		}
		
	}

