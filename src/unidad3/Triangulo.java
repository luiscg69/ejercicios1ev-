package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// Created by Luis Cort�s
		// Date: 11-11-2019
				
		/*Determinar si al introducir tres numeros reales, pueden conformar un triangulo 
		 * y en caso positivo de que tipo es escaleno, equilatero o is�sceles*/
			
		
				Scanner input = new Scanner (System.in);
				
		System.out.println("Comprobaci�n de si tres n�meros reales, pueden ser los lados de un triangulo y en caso afirmativo el tipo de triangulo\n");		
				
				//Solicitamos los 3 N�meros Reales
				
				System.out.print("Por favor, introduzca su Primer n�mero real: ");
				float numero1 = input.nextFloat ();
				
				System.out.print("Por favor, introduzca su Segundo n�mero real: ");
				float numero2 = input.nextFloat ();
				
				System.out.print("Por favor, introduzca su Tercer n�mero real: ");
				float numero3 = input.nextFloat ();
				
				
			//Para que sea un triangulo la suma de cuaquiera de dos de los lados  tiene que ser mayor  al otro lado que falta.
				
				//Primero valoramos Si cumple la condici�n para ser triangulo
				
				if((numero1 + numero2 > numero3) && (numero1 + numero3 > numero1) && (numero1 + numero3 > numero2)) { 
					//Si se cumple esta condici�n, es un triangulo, ahora hay que averiguar que tipo de triangulo es
				
										
					//Si todos sus lados son iguales es Equilatero
					if ((numero1==numero2) && (numero2==numero3)) {
						System.out.println("");
						System.out.print("Los n�meros introducidos pueden ser los lados de un triangulo Equilatero");
					}
					
					//Si no fue equilatero entonces valoramos si es Isosceles, tiene dos de sus lados iguales y el otro desigual
					else if (((numero1 == numero2) && ( numero2 != numero3)) || (( numero1 == numero3) && (numero3 != numero2)) || ((numero2 == numero3) && (numero3 != numero1))) {
						System.out.println("");
						System.out.print("Los n�meros introducidos pueden ser los lados de un triangulo Isosceles");
					}
					
					//Y si no fuese ni equilatero, ni isosceles, deberia ser escaleno, pero incluso comprobamos que los tres lados deberan ser distintos
					else if ((numero1 != numero2) && ( numero2 != numero3) && ( numero1 != numero3)){
						System.out.println("");
						System.out.print("Los n�meros introducidos pueden ser los lados de un triangulo Escaleno");
					}
					
				}	//Cerramo el if de que S� puede ser un triangulo
				
				
				else {  //Sino se cumplio la condic�n de ser triangulo, entonces decimos que No lo puede ser 
					
					System.out.println("");
					System.out.print("Los n�meros introducidos No pueden ser los lados de un triangulo");
					
				}//Cerramo el if de que No  puede ser un triangulo
	}			
}

						
