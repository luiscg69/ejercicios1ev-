package unidad3;


import java.util.Scanner;

public class Hora1 {


	public static void main(String[] args) {
		// Created by Luis Cortés
		// Version 2
		// Date: 11-11-2019
		
		//Calculo y salida por pantalla de la (Hora, Minuto y Segundo) introducidos por consola sumando un segundo,
		
		//Vamos a utilizar los condicionales y variable de modo mas eficiente.
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
		 * y les sumamos 1, los segundos finales serán (59 + 1 = 60 segundos) son  0 segundos y hay
		 * que sumarle 1 minuto a los minutos iniciales.
		 * Si los minutos en el caso de sumarles 1 son (59 + 1 = 60 minutos) son 0 minutos y hay
		 * que sumarle 1 hora a las horas iniciales.
		 * Si loas Horas en el caso de sumarles 1 sean (23 + 1 = 24 horas ) son las 0 horas
		 */
			
			
		//sumo 1 a los segundo Iniciales
		 segundoI =  segundoI +  1; 
					   
			if (segundoI > 59){
				    segundoI = 0;
				    	minutoI=minutoI+1;
				}		if(minutoI > 59) {
					       minutoI = 0;
						    	horaI= horaI+1;
						}		if(horaI > 23) {
									horaI = 0;	
									}

		
			
	System.out.println();	
	
	//El resultado lo saco por pantalla con el formato de horas (hh:mm:ss)
	
	System.out.printf("Un segundo despues a la hora que usted introdujo son las %02.0f : %02.0f : %02.0f",(float) horaI, (float) minutoI, (float) segundoI);		
	
	input.close();
	}		
}

