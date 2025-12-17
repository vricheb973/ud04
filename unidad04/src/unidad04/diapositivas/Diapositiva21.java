package unidad04.diapositivas;

import java.util.Scanner;

public class Diapositiva21 {

	public static void main(String[] args) {

		/*
		 * Introduce por teclado un número n; a continuación, solicita 
		 * al usuario que teclee n números y los introduzca en una tabla. 
		 * Después debes recorrerla y realizar la media de los números 
		 * positivos, la media de los negativos y cuenta el número de 
		 * ceros introducidos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño de la tabla: ");
		int tam = sc.nextInt();
		
		int[] numeros = new int[tam];
		
		for(int i=0; i<=numeros.length-1; i++) {
			System.out.println("Introduzca el elemento " + i + ": ");
			numeros[i] = sc.nextInt();
		}
		
		double sumPositivos = 0;
		int contPositivos = 0;
		double sumNegativos = 0;
		int contNegativos = 0;
		int contCeros = 0;
		
		for(int elem : numeros) {
			if(elem > 0) {
				sumPositivos += elem;
				contPositivos++;
			}
			else if(elem < 0) {
				sumNegativos += elem;
				contNegativos++;
			}
			else {
				contCeros++;
			}
		}

		System.out.printf("Media positivos: %.2f \n", sumPositivos/contPositivos);
		System.out.printf("Media negativos: %.2f \n", sumNegativos/contNegativos);
		System.out.println("Nº de ceros: " + contCeros);
		
		sc.close();
		

	}

}
