package ejerciciosUD04;

import java.util.Arrays;

public class BoletinArrays {

	public static void main(String[] args) {
		
		int[] array = {1,1,1,2,2,2,2,3};

		System.out.println(calculaModaInt(array));
		
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
	
	/*
	 * volteaArrayInt: Le da la vuelta a un array.
	 */
	
	public static void voltea1(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		
		for(int i=copia.length-1, j=0; i>=0; i--, j++) {
			original[j] = copia[i];
		}
	}
	
	public static void voltea2(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		
		for(int i=0; i<copia.length; i++) {
			original[i] = copia[copia.length-1-i];
		}
	}		
	
	public static void desplazaUnoDerechaArrayInt(int[] original) {
		int[] copia = Arrays.copyOf(original, original.length);
		
		for(int i=0; i<=copia.length-2; i++) {
			original[i+1] = copia[i];
		}
		original[0] = copia[copia.length-1];
	}
	
	public static void desplazaDerechaArrayInt(int[] original, int n) {
		for(int i=0; i<n; i++) {
			desplazaUnoDerechaArrayInt(original);
		}
	}
	
	public static int[] fibonacci(int n) {
		if(n < 2) {
			throw new IllegalArgumentException("El número debe ser mayor o igual a 2. ");
		}
		
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i=2; i<fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		
		return fibonacci;		
	}
	
	/*
	 * Desarrollar la función calculaModaInt, que nos devuelve el valor que más 
	 * se repite en un array de enteros. En caso de que varios valores se repitan 
	 * las mismas veces, se devuelve el que encontremos primero. Ejemplos:
	 *   + calculaModaInt({1,1,1,2,2,3}): 1
	 *   + calculaModaInt({1,1,1,2,2,2,2,3}): 2
	 *   + calculaModaInt({1,1,1,2,2,2,3}): 1
	 */
	public static int calculaModaInt(int[] array) {
		int moda = 0;
		int maxRep = 0; //Aquí vamos a guardar las repeticiones maximas
		
		for(int e : array) {
			int cont = 0; //Aqui vamos contando cada elemento e (tenemos que resetearlo cada vez que cambiamos e) 
			for(int f : array) { // Con este bucle vamos contando cuantas veces aparece e
				if(e == f) { //Si coinciden sumo 1 al contador
					cont++;
				}
			}
			if(cont > maxRep) {
				maxRep = cont;
				moda = e;
			}
		}
		
		return moda;
	}
	
	
	
	
	
	
	/*
	 * Desarrollar la función modificaArray, que recibe un array de enteros y dos 
	 * enteros (valor y distancia). La función recorrerá el array y:
	 *  + Cuando encuentra un número menor que valor le resta distancia.
	 *  + Cuando encuentra un número mayor que valor le suma distancia.
	 *  + Cuando encuentra un número igual que valor no lo modifica.
	 */
	public static void modificaArray(int[] array, int valor, int distancia) {
		for(int i=0; i<array.length; i++) {
			if(array[i] < valor) {
				array[i] = array[i] - distancia;
			}
			else if (array[i] > valor) {
				array[i] = array[i] + distancia;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
