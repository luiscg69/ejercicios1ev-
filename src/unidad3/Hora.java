package unidad3;

import java.util.Scanner;

public class Hora {


	public static void main(String[] args) {
		// Created by Luis Cortés
		// Date: 04-11-2019
		
		//Calculo y salida por pantalla de la (Hora, Minuto y Segundo) introducidos por consola sumando un segundo,
		
		
		//vamos a utilizar la clase Scanner para introducir primero las Horas, luego los Minutos y Luego los Segundos.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Calculo de la hora correspondiente al segundo siguiente a la hora que usted introduzca\n");
		
		//Se introducen las horas
				
		System.out.print("Por favor, introduzca la Hora (0 a 23) ");
		int horaI = input.nextInt();
		
		
			//Mientras la hora introducida sea o menor que 0 o mayor que 23 seguira pidiendola
			
			while(horaI<0||horaI>23) {
				
			System.out.print("Por favor, introduzca la Hora correctamente de 0 a 23");
			
			horaI = input.nextInt(); 
			}
				
			
		//Se introducen las minutos
			
		System.out.print("Por favor, introduzca los Minutos ");
		int minutoI = input.nextInt();
		
			//Mientras los minutos introducidos sean o menor que 0 o mayor que 59 seguira pidiendolos
		
			while(minutoI<0||minutoI>59) {
			
			System.out.print("Por favor, introduzca los Minutos correctamente de 0 a 59 ");
			
			minutoI = input.nextInt();
		
			}
			
			
			
		//Se introducen los segundos
			
		System.out.print("Por favor, introduzca los Segundos ");
		int segundoI = input.nextInt();
		
		
			//Mientras los segundos introducidos sean o menor que 0 o mayor que 59 seguira pidiendolos
		
			while(segundoI<0||segundoI>59) {
			
			System.out.print("Por favor, introduzca los Segundos correctamente de 0 a 59 ");
			
			segundoI = input.nextInt();
		
			}
			
			
			
		
		/* Tenemos que tener en cuenta que si los segundos iniciales introducidos son 59
		 * y les sumamos 1, los segundos finales serán (59 + 1 = 60 segundos) los 0 segundos y hay
		 * que sumarle 1 minuto a los minutos iniciales.
		 */
			
			int segundoF = segundoI + 1; //sumo 1 segundo a los segundos iniciales
			int minutoExtra =0; //inicio una variable igual a 0, que será la que incrementara en 1 los minutos, si los segundos finales sumasen 60
			
				// Si los segundos finales son 60 les doy el valor de 0 y los minutos extras son de 1
				if (segundoF == 60){
				    segundoF = 0;
				    minutoExtra=1;
				}		

		
			/* Tenemos que tener en cuenta que si los minutos iniciales introducidos son 59
			 * y si el minutoextra es 1, los minutos finales serán (59 + 1 = 60 minutos) los 0 minutos y hay
			 * que sumarle 1 hora a las horas iniciales.
			*/
			
			int minutoF = minutoI + minutoExtra; //sumo minutosExtra a los minutos iniciales
			int horaExtra = 0; // inicio una variable igual a 0, que será la que incrementara en 1 las horas, si los minutos finales sumasen 60
		
						
				// Si los minutos finales son 60 les doy el valor de 0 y las horas extras son de 1
				if (minutoF == 60){
				    minutoF = 0;
				    horaExtra=1;
				}
						
				
				
				
				/* Tenemos que tener en cuenta que si las horas iniciales introducidos son 23
				 * y si la horaextra es 1, las horas finales serán (23 + 1 = 24 horas) las 0 horas
				 */
				
				// Si las horas finales son 24 les doy el valor de 0.
				int horaF = horaI + horaExtra;
								
					if (horaF == 24){
					    horaF = 0;
					}
					
					
	System.out.println();	
	
	//El resultado lo saco por pantalla con el formato de horas (hh:mm:ss)
	
	System.out.printf("La hora que usted introdujo eran las \u0028%02.0f\u003a%02.0f\u003a%02.0f\u0029\nUn segundo despues son las \u0028%02.0f\u003a%02.0f\u003a%02.0f\u0029\n" ,(float) horaI, (float) minutoI, (float) segundoI, (float) horaF, (float) minutoF, (float) segundoF);		
	
	input.close();
	}		
}
