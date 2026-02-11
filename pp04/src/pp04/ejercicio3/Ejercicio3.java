package pp04.ejercicio3;

import java.util.Arrays;

public class Ejercicio3 extends Object {

	public static void main(String[] args) {

		Ejercicio3 ej3 = new Ejercicio3();

		
	}
	
	/*
	 * Ejercicio 3. Desarrollar la función estática obtenerRango. Esta función recibe un 
	 * array de enteros y debe devolver la diferencia entre el valor máximo y el valor 
	 * mínimo (el rango). 
	 */
	public static int obtenerRango(int [] array)  {
		int max = array[0];
		int min = array[0]; 
		
		for(int e : array) {
			if(e > max) {
				max = e;
			}
			if(e < min) {
				min = e;
			}
		}
		
		return Math.abs(max - min);
	}
	
	public static int obtenerRangoPro(int [] array)  {
		Arrays.sort(array);
		return Math.abs(array[array.length-1] - array[0]);
	}

}
