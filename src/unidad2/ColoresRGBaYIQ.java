package unidad2;

import java.util.Scanner;

public class ColoresRGBaYIQ {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
				
		System.out.println("Conversión de un color en el espacio RGB en sus componentes YIQ\n");
		
		System.out.println("Tenga en cuenta que el separador de decimales es la coma ,\n");
		
		float r;
		float g;
		float b;
		
		float y;
		float i;
		float q;
		
		System.out.print("Introduzca el numero del color Rojo del sistema RGB: ");
		r= input .nextFloat();
		
		System.out.print("Introduzca el numero del color Verde del sistema RGB: ");
		g= input .nextFloat();
		
		System.out.print("Introduzca el numero del color Azul del sistema RGB: ");
		b= input .nextFloat();
		
		
		y=(0.299f*r)+(0.587f*g)+(0.114f*b);
		i=(0.596f*r)-(0.275f*g)-(0.321f*b);
		q=(0.212f*r)-(0.528f*g)+(0.311f*b); 
		
		System.out.println();
		
		System.out.printf("El color en el sistema RGB\u0028 %.2f \u002c %.2f \u002c %.2f \u0029 en el sistema YIQ es el \u0028 %.3f \u002c %.3f \u002c %.3f \u0029", r,g,b,y,i,q);
		
		input.close();
	}

}
