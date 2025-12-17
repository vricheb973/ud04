package unidad04.diapositivas;

import java.util.Arrays;

public class Diapositiva17 {

	public static void main(String[] args) {

		// Inicializamos un array de sueldos con el SMI (1234.56)
		double[] sueldos = new double[5];
		
		Arrays.fill(sueldos, 1234.56);
		
		// Muestro los sueldos
		System.out.println(Arrays.toString(sueldos));
		
		// Voy a subir el sueldo de los empleados un 20%
		// Si voy a realizar operaciones de escritura uso for clásico
		for(int i=0; i<=sueldos.length-1; i++) {
			sueldos[i] = sueldos[i] * 1.2; 
//			sueldos[i] += sueldos[i] * 0.2; 
//			sueldos[i] = sueldos[i] + sueldos[i] * 0.2; 
		}
		
		// Supongamos que Arrays.toString no funciona y 
		// quiero mostrar los elementos del array
		// Cuando quiero leer los elementos del array sin importar la posición en la que 
		// se encuentran usaré el foreach o for extendido (es lo mismo)
		/*
		 *        for(tipo elemento : array) {
		 *        	codigo
		 *        	codigo
		 *        }
		 */
		for(double e : sueldos) {
			System.out.print(e + " ");
		}
		
		// Uso de for para arrays:
		// - Si solo quiero leer el array -> foreach
		// - Si quiero leerlo pero necesito la posicion -> for clásico
		// - Si quiero modificar elementos del array -> for clásico
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
