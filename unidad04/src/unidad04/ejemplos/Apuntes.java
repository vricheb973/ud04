package unidad04.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Apuntes {

	public static void main(String[] args) {

		// Declaramos la variable
//		int[] edades;
		
		
		// Si queremos asignar un valor a esas variables
		// tenemos dos opciones:
		// Puedo declararla e inicializarla
		int[] edades = new int[5];
//		double[] arraY2;
//		String[] array3;
//		Alumno alumno = new Alumno();
//		Scanner sc = new Scanner(System.in);
		
		int numero = 9;
		double numeroDecimal = 3.0;
		
		// O puedo inicializarla posteriormente
		// Si lo inicializo de esta manera se rellena con ceros 
		edades = new int[5];
		
		// Aquí estoy leyendo lo que hay en la posicion 0
		System.out.println(edades[0]);
		
		// En este caso estoy escribiendo en la posicion 0
		edades[0] = 85; 
		edades[1] = 3;
		edades[2] = 19;
		edades[3] = 23;
		edades[4] = 7;
		
		// Si quiero imprimir el array por pantalla:
		System.out.println(edades);
		
		// Hay un caso en el que puedo declarar e inicializar el array del tirón
		int[] edades3 = {85, 3, 19, 23, 7};

		System.out.println(Arrays.toString(edades3));
		
		// Métodos útiles de los arrays
		// Para obtener el tamaño de un array:
		System.out.println(edades.length);
		
		System.out.println(Arrays.equals(edades, edades3));
		
		//Mucho cuidado con acceder a una posición que no existe, revisar condicion del for
		System.out.println(edades[95]);
		
	}

}
