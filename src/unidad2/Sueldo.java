package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner (System.in);
	
	float SueldoBase;
	float Venta1;
	float Venta2;
	float Venta3;
	float TotalVentas;
	float ComisionVentas;
	float SalarioTotal;
	
	System.out.println("Tenga en cuenta que el separador de decimales es la coma ,\n");
	
	System.out.print("Introduzca su Salario Base Mensual en Euros: ");
	SueldoBase = input.nextFloat();
	
	System.out.print("Introduzca el Total de Euros facturado de la Primera Venta: ");
	Venta1 = input.nextFloat();
	
	System.out.print("Introduzca el Total de Euros facturado de la Segunda Venta: ");
	Venta2 = input.nextFloat();
			
	System.out.print("Introduzca el Total de Euros facturado de la Tercera Venta: ");
	Venta3 = input.nextFloat();

	TotalVentas =  (Venta1+Venta2+Venta3);
	
	ComisionVentas = TotalVentas * 0.1f;
	
	SalarioTotal = SueldoBase + ComisionVentas;
	
	System.out.println();
	
	System.out.printf("Usted este mes ha facturado: %.2f \u20ac\n\n", TotalVentas);
	
	System.out.printf("Su comisión del 10 por ciento de las ventas, este més asciende a: %.2f \u20ac\n\n", ComisionVentas);
	
	System.out.printf("Este més su Salario Total es de: %.2f \u20ac\n", SalarioTotal);
	
	
	}

}
