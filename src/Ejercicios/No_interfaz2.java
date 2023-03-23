/**************************************
 * Autor: Cruz Ortega Elio Justino    *
 * Fecha Creación: 22/03/23           *
 * Fecha Actualización: 22/03/23	  *
 * Descripción: Ejercicios para		  * 
 * 				viernes				  *
 **************************************/

package Ejercicios;

import java.util.Scanner;

public class No_interfaz2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int a, b, c, d, e, f, g, h, i, j, k, s;
		
		//Ejercicio 9
		System.out.println("Calcula el área con sus tres lados.");
		System.out.print("Ingresa el lado a: ");
		a = leer.nextInt();
		System.out.print("Ingresa el lado b: ");
		b = leer.nextInt();
		System.out.print("Ingresa el lado c: ");
		c = leer.nextInt();
		
		double s1 = (a+b+c)/2;
		double area= Math.sqrt(s1 * (s1-a) * (s1-b) * (s1-c));
		
		System.out.print("El área es: " + area);
		System.out.println(" ");
		
		//Ejercicio 11
		System.out.println("Desglozador de número de 5 cifras");
		System.out.print("Ingresa un número entero de 5 cifras: ");
		d = leer.nextInt();
		Object numero = null;
		String numeroString = String.copyValueOf((char[]) numero);
		System.out.print("Cifras del núemero desde el principio: ");
		for (int i1 = 0 ; i1 < numeroString.length() ;  i1++) {
			System.out.print(numeroString.charAt(i1) + " ");
		}
		
	}

}
