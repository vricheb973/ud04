package ejerciciosUD04;

import java.util.Arrays;

public class Boletin1 {

	public static void main(String[] args) {

		int[] numeros = {3,5,2,3,3};

		System.out.println(posicionEnArray(numeros, 13));
		
	}
	
	/*
	 * mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
	 */
	public static double mediaArrayInt(int[] array) {
		double media = 0.0;
		
		for(int elem : array) {
			media += elem;
		}
		
		return media / array.length;
	}
	
	/*
	 * estaEnArrayInt: Dice si un número está o no dentro de un array.
	 */
	public static boolean estaEnArrayInt(int[] array, int numero) {
		boolean encontrado = false;
		
		for(int e : array) {
			if(e == numero) {
				encontrado = true;
			}
		}
		
		//Solución super-eficiente que para el for cuando encuentro el elemento
//		for(int i=0; i<array.length && !encontrado; i++) {
//			if(array[i] == numero) {
//				encontrado = true;
//			}
//		}
		
		return encontrado;
	}
	
	/*
	 * posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en 
	 * la que se encuentra. En caso de no estar devuelve -1.
	 */
	public static int posicionEnArray(int[] array, int numero) {
		int posicion = -1;
		
		for(int i=0; i<array.length && posicion == -1 ; i++) {
			if(array[i] == numero) {
				posicion = i;
			}
		}
		
		return posicion;
	}
	
	public static void voltea1(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		
		int pos = 0;
		
		for(int i=original.length-1; i>=0; i--) {
			original[pos] = copia[i];
			pos++;
		}
	}
	
	public static void voltea2(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		
		int pos = original.length-1;
		
		for(int i=0; i<original.length; i++) {
			original[pos] = copia[i];
			pos--;
		}
	}
	
	public static void voltea3(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		
		for(int i=0; i<original.length; i++) {
			original[i] = copia[original.length-1-i];
		}
	}
		
}
