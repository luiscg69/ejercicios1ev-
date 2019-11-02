package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2DeLaUnidad2Conversor {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float euros;
		System.out.print("Introduzca los Euros que quiera convertir a Dolares: ");
		String linea = in.readLine();
		euros = Float.parseFloat(linea);
		float dolares;
		dolares = euros * 1.11f;
		System.out.printf("%.2f \u20ac son %.2f \u0024", euros, dolares);
		
	}

}
