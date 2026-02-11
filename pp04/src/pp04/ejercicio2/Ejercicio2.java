package pp04.ejercicio2;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Ejercicio 2. Desarrollar la función estática cosasConArrays. Esta función recibe 
	 * un array de enteros y debe modificar cada elemento (excepto el primero y el último) 
	 * sustituyéndolo por la media entera de sus dos vecinos (el anterior y el posterior).
	 */
	public static void cosasConArrays(int[] array) {
		int[] copia = Arrays.copyOf(array, array.length);
		
		for(int i=1; i < array.length -1; i++) {
			array[i] = (copia[i-1] + copia[i+1]) / 2;
		}
	}
	

}
