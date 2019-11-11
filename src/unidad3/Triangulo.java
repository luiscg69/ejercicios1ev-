package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// Created by Luis Cortés
		// Date: 11-11-2019
				
		/*Determinar si al introducir tres numeros reales, pueden conformar un triangulo 
		 * y en caso positivo de que tipo es escaleno, equilatero o isósceles*/
			
		
				Scanner input = new Scanner (System.in);
				
		System.out.println("Comprobación de si tres números reales, pueden ser los lados de un triangulo y en caso afirmativo el tipo de triangulo\n");		
				
				//Solicitamos los 3 Números Reales
				
				System.out.print("Por favor, introduzca su Primer número real: ");
				float numero1 = input.nextFloat ();
				
				System.out.print("Por favor, introduzca su Segundo número real: ");
				float numero2 = input.nextFloat ();
				
				System.out.print("Por favor, introduzca su Tercer número real: ");
				float numero3 = input.nextFloat ();
				
				
			//Para que sea un triangulo la suma de cuaquiera de dos de los lados  tiene que ser mayor  al otro lado que falta.
				
				//Primero valoramos Si cumple la condición para ser triangulo
				
				if((numero1 + numero2 > numero3) && (numero1 + numero3 > numero1) && (numero1 + numero3 > numero2)) { 
					//Si se cumple esta condición, es un triangulo, ahora hay que averiguar que tipo de triangulo es
				
										
					//Si todos sus lados son iguales es Equilatero
					if ((numero1==numero2) && (numero2==numero3)) {
						System.out.println("");
						System.out.print("Los números introducidos pueden ser los lados de un triangulo Equilatero");
					}
					
					//Si no fue equilatero entonces valoramos si es Isosceles, tiene dos de sus lados iguales y el otro desigual
					else if (((numero1 == numero2) && ( numero2 != numero3)) || (( numero1 == numero3) && (numero3 != numero2)) || ((numero2 == numero3) && (numero3 != numero1))) {
						System.out.println("");
						System.out.print("Los números introducidos pueden ser los lados de un triangulo Isosceles");
					}
					
					//Y si no fuese ni equilatero, ni isosceles, deberia ser escaleno, pero incluso comprobamos que los tres lados deberan ser distintos
					else if ((numero1 != numero2) && ( numero2 != numero3) && ( numero1 != numero3)){
						System.out.println("");
						System.out.print("Los números introducidos pueden ser los lados de un triangulo Escaleno");
					}
					
				}	//Cerramo el if de que Sí puede ser un triangulo
				
				
				else {  //Sino se cumplio la condicón de ser triangulo, entonces decimos que No lo puede ser 
					
					System.out.println("");
					System.out.print("Los números introducidos No pueden ser los lados de un triangulo");
					
				}//Cerramo el if de que No  puede ser un triangulo
	}			
}

						
