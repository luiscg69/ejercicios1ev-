package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calificaciones {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Matem�ticas
				
		
		System.out.print("Introduzca la nota del Examen de Matem�ticas: ");
		float notaM = Float.parseFloat(in.readLine());
		
		System.out.print("Introduzca la nota de la primera tarea de Matem�ticas: ");
		float notaT1M=Float.parseFloat(in.readLine());

		System.out.print("Introduzca la nota de la primera tarea de Matem�ticas: ");
		float notaT2M=Float.parseFloat(in.readLine());
		
		System.out.print("Introduzca la nota de la tercera tarea de Matem�ticas: ");
		float notaT3M=Float.parseFloat(in.readLine());
		
		float mediaTM = ( notaT1M + notaT2M + notaT3M ) / 3;
		
		float mediaM = (notaM * 0.9f) + ( mediaTM * 0.1f);
		
	
		//F�sica
		
		System.out.print("Introduzca la nota del Examen de F�sica: ");
		float notaF= Float.parseFloat(in.readLine());
		
		System.out.print("Introduzca la nota de la primera tarea de F�sica: ");
		float notaT1F=Float.parseFloat(in.readLine());

		System.out.print("Introduzca la nota de la primera tarea de F�sica: ");
		float notaT2F=Float.parseFloat(in.readLine());
		
				
		float mediaTF = ( notaT1F + notaT2F ) / 2;
		
		float mediaF = (notaF * 0.8f) + ( mediaTF * 0.2f);
		
		
		//Qu�mica
		
		System.out.print("Introduzca la nota del Examen de Qu�mica: ");
		float notaQ= Float.parseFloat(in.readLine());
				
		System.out.print("Introduzca la nota de la primera tarea de Qu�mica: ");
		float notaT1Q=Float.parseFloat(in.readLine());

		System.out.print("Introduzca la nota de la primera tarea de Qu�mica: ");
		float notaT2Q=Float.parseFloat(in.readLine());
				
		System.out.print("Introduzca la nota de la primera tarea de Qu�mica: ");
		float notaT3Q=Float.parseFloat(in.readLine());
				
						
		float mediaTQ = ( notaT1Q + notaT2Q + notaT3Q) / 3;
				
		float mediaQ = (notaQ * 0.85f) + ( mediaTQ * 0.15f);
					     
	    
	    float mediaTotal = (mediaM + mediaF + mediaQ)/3;
	    
	    System.out.printf("La Nota Media de Matem�ticas es de: %.2f \n", mediaM);
	    System.out.printf("La Nota Media de F�sica es de: %.2f \n", mediaF);
	    System.out.printf("La Nota Media de Qu�mica es de: %.2f \n", mediaQ);
	    
	    System.out.printf("La Nota Media de las Tres Materias es de: %.2f \n", mediaTotal);
	    
	     
	}

}