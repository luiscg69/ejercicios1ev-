package unidad2;

public class Ejercicio1DeLaUnidad2 {
	
	public static void main(String[] args) {
	
	
	//1234 y 532 son numero enteros, por lo tanto si los dividimos el resultado será un entero en este caso 2
		
	/*El ejercicio nos dice que el resultado tiene que ser un decimal de 2 digitos, por lo tanto
	
	en principio deberemos convertir los numeros enteros en decimales (float) para que la division
	salga como resultado un decimal (float). 
			
			Podemos hacerlo de dos maneras 1234.0 / 532.0, el resultado ya dara un decimal
			
			O
			
			En la misma division decirle que cada numero es un decimal (float) 1234f/532f
			Esta es la opción por la que optamos
			
	Por otra parte el enunciado nos dice que el resultado tiene que tener 15 digitos y de estos 2 digitos son la parte decimal
	entonces debemos  formatear el resultado con System.out.printf("formato",resulado a formatear);
	
	Entonces utilizaremos el fomato "%15.2f" donde le decimos que el resultado es 15 digitos .2 decimales y f es un float
	posteriormente le pongo un \n para que haga un salto de linea
	
	
			*/
		
		
	System.out.printf("1234/532 = %15.2f\n", 1234f/532f);
	
	
		// Como aclaración la clase System es del paquete java.lang que es el paquete que java por defecto, no hace falta importarlo
	   
	//FIN
	
	}
}
