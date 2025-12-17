package unidad04.diapositivas;

import java.util.Arrays;
import java.util.Random;

public class Diapositiva20 {

	public static void main(String[] args) {

		/*
		 * Crear una tabla de longitud 10 que se inicializará con 
		 * números aleatorios comprendidos entre 1 y 100. Mostrar 
		 * la suma de todos los números aleatorios que se guardan 
		 * en la tabla.
		 */
		
		int[] numeros = new int[10];
		int suma = 0;
		
		Random r = new Random();
		
		for(int i=0; i<=numeros.length-1; i++) {
			numeros[i] = r.nextInt(1, 100+1);
			suma += numeros[i];
		}

		System.out.println("El array generado es: " + Arrays.toString(numeros));
		System.out.println("La suma de todos sus elementos es: " + suma);

	}

}
