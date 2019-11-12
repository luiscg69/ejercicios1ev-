package unidad3;

import java.util.Scanner;

public class Multiplicar {

	
	public static void main(String[] args) {
		// Created by Luis Cortés
		// Date: 12-11-2019
				
		//Aprendiendo a Multiplicar

		
		Scanner input = new Scanner(System.in); //Creamos el objeto input de la clase Scanner que es el que leera los datos introducidos por la consola
		
		System.out.println("Apredemos a multiplicar");	//Titulo
		
		
		int repasar; //creamos esta variable para hacer un bucle do while. Vamos a repetir todo el proceso si repasar = 1
		
		do // Inicio del bucle do 
			
		// Sentencias del bucle do	
		{
		
		    //Nos solicita que introduzcamos un numero por consola, que tiene que ser entre el 1 y el 9
			System.out.println("\nHola, que tabla de multiplicar quieres repasar?. Introduce un valor entre el 1 y el 9: ");
			int Tablamultiplicar = input.nextInt(); // es el numero de la tabla de multiplicar que queremos preguntar
                 
			    //Mientras el numero introducido no sea entre el 1 o el 9, va a seguir preguntandonos, 
				while ((Tablamultiplicar <1)||(Tablamultiplicar >9)) {
					System.out.print("Has introducido el número "+Tablamultiplicar+" ,debes introducir un valor entre el 1 y el 9 para poder continuar: ");
					Tablamultiplicar = input.nextInt();
					  
				}//Si se cumple la condición salimos del While, es decir, el numero de la tabla esta entre 1 y 9
				
				
				
				System.out.println("\nHas escogido la tabla de multiplicar del número "+Tablamultiplicar+" , vamos a ver cuanto sabes, responde a las preguntas\n");
				
				int Cfallos =0; //variable de contador de fallos la cual tiene valor 0 porque empezamos con 0 fallos
				
				
				
				
				
				/*Empezamos un buble for el cual la variable x se ira incrementado en 1, desde 1 hasta 10
				,que sera el segundo factor de la multiplicación, el numero de tabla (Tablamultiplicar) por x,
				empezando x por el numero 1  
				*/
				
								
								
				for(int x=1; x<=10; x++) {	/* bucle for donde empezamos con x=1, acabara cuando x sea igual o menor a 10,
											y al x=1 le iremos sumando 1 cada vez que se haga el bucle
											1, 2, 3, 4, 5, 6, 7, 8, 9, 10
											*/
					
					
					//vamos preguntando el resultado que el usuario cree que es la solucion de la 	tabla (Tablamultiplicar) por el valor que va tomando x
					System.out.print("Cuanto es "+Tablamultiplicar+" por "+ x +" :");
					int resultado = input.nextInt();
					
					
						/*Si el resultado introducido es incorrecto, entonces nos dirá que es incorrecto
						*  y mostrara por pantalla cual es el resultado correcto
						*  al mismo tiempo a la variable de contador de fallos (Cfallos) le vamos sumando 1 al valor que tenga en cada momento
						*/						
						if (resultado != (Tablamultiplicar*x)){
						System.out.println("\nEl resultado es incorrecto "+Tablamultiplicar+" por "+ x +" es igual a "+(Tablamultiplicar*x+"\n"));	
						Cfallos = Cfallos + 1;
						}	
				
				}//Finalizamos el for, el cual nos preguntaba por los resultados de la tabla de multicar un numero del 1 al 10
				
				
				
				/*Ahora Valoramos con un if else en función del numero de fallos que es eñ valor que tiene la variable Cfallos en este momento
				 * 
				 * Si los fallos son menores que 2 entonces nos dice que hemos aprovado
				 * Sino es decir los fallos son mayores a 1, nos dice que hemos suspendido y los fallos que hemos tenido (Cfallos)  
				 */
				
				 if (Cfallos<2) {	
				
					System.out.println("\nEnhorabuena has aprobado!!, has tenido "+ Cfallos+" fallos");
			
				}else {
						
					System.out.println("\nDeberías repasar, has supendido!!, has tenido "+ Cfallos+" fallos. Para aprobar debes tener menos de 2 fallos.");
				}// Fin condicional de fallos
					
				/*Preguntamos al usuario si quiere realizar otra vez el ejercicio (otra tabla de multiplicar) lo que reponda lo guardamos en la variable Entera la declaramos al principio (repasar)
				 * Le decimos que introduza un 1 si quiere repetir la tarea o un 0 si desea finalizar. 
				 *   
				 */
				System.out.print("\nDeseas repasar otra tabla de multiplicar? responde con:\n1 :para repetir\n0 :para No repetir\n\nQue quieres hacer?:");
				 repasar= input.nextInt();
				
                     /*Si no introduce 1 o 0 va a seguir preguntando, hasta que el valor introducido sea o 1 o 0
				      o lo que es lo mismo que el valor introducido sea distinto de 0 y 1 
				  	  */
					while ((repasar != 1 && repasar != 0)) {
						System.out.print("\nPor favor responde con '1' para repertir o con '0' para no repetir: ");
						 repasar= input.nextInt();
					}// salimos de while cuando se cumpla la condición, es decir, el usuario introdujo 0 o 1 
						
				
			} while (repasar == 1);  /*Este el while que mientras el usuario conteste que quiere repetir la tarea es decir con un 1
										, va a seguir repitiendo el porceso desde el do inicial
			 						*/
		//En el caso de que el usuario saliese del do while por no haber contestado 1, es decir, repetir la tarea, nos saldrá un mensaje en pantalla de despedida.
		System.out.println("\nMuchas gracias, espero volver a verte pronto.");
	
	input.close();//cerramos el objeto Scanner input
	}

}
