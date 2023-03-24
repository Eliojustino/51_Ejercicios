
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
		int a, b, c, d, e, f, g, h;
		
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
		
		System.out.println("El área es: " + area);
		System.out.println(" ");
		
		//Ejercicio 11
		System.out.println("Desglozador de número de 5 cifras");
		System.out.print("Ingresa un número entero de 5 cifras: ");
		d = leer.nextInt();
		char[] cifras = Integer.toString(d).toCharArray();
		System.out.println("Las cifras del número son: ");
		for (char cifra : cifras) {
			System.out.println("-" + cifra);
		}
		System.out.println(" ");
		
		//Ejercicio 13
		System.out.println("Programa que calcule un número de la suerte. ");
		System.out.print("Ingresa tu día de nacimiento: ");
		e = leer.nextInt();
		System.out.print("Ingresa tu mes de nacimiento: ");
		f = leer.nextInt();
		System.out.print("Ingresa tu año de cacimiento: ");
		g = leer.nextInt();
		h = (int) (Math.random()*9+1);
		System.out.print("Tú número de la suerte es: " + h);
	}
}
