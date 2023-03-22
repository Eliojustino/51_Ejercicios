/**************************************
 * Autor: Cruz Ortega Elio Justino    *
 * Fecha Creación: 22/03/23           *
 * Fecha Actualización: 22/03/23	  *
 * Descripción: Ejercicios para		  * 
 * 				viernes				  *
 **************************************/

package Ejercicios;
import java.util.Scanner;

public class No_interfaz1{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		final double PI = 3.14;
		int a, b, c, d, e, f, g, h, i;
	
		//Ejercicio 1
		System.out.println("Lector de 2 números.");
		System.out.println("Introduzca dos números: ");
		a = leer.nextInt();
		b = leer.nextInt();
		System.out.println(" ");
	
		//Ejercicio 3
		System.out.println("Multiplica el número por 2 y luego por 3.");
		System.out.print("Introduzca un número: ");
		c = leer.nextInt();
		System.out.println("El doble del número es: " + c*2 + ". El triple del número es: " + c*3);
		System.out.println(" ");
	
		//Ejercicio 5
		System.out.println("Calcula la circunferencia y el área.");
		System.out.println("Introduce el radio de una circunferencia: ");
		d = leer.nextInt();
		e =  (int) (2*(PI*d));
		f = (int) (PI*(d*d));
		System.out.println("La longitud de la circunferencia es: " + e + ". El area es: " + f);
		System.out.println(" ");
	
		//Ejercicio 7
		System.out.println("Calcula la hipotenusa.");
		System.out.print("Introduce el primer cateto: ");
		g = leer.nextInt();
		System.out.print("Introduce el segundo cateto: ");
		h = leer.nextInt();
		i = ((g*g)+(h*h));
		double resultado = Math.sqrt(i);
		System.out.println("El valor de la hipotenusa es: " + resultado);
		System.out.println(" ");
	}
}