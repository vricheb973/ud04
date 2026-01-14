package unidad04.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo1 {

	public static void main(String[] args) {

		String[] nombres = new String[6];
		
		nombres[1] = "Manolo";
		nombres[3] = "Manolo";
		
		System.out.println(Arrays.toString(nombres));
		
		List<Integer> lista = new ArrayList<Integer>();
		
		//Diseña un algoritmo que indique las posiciones vacías del array
		for(int i=0; i < nombres.length; i++) {
			if(nombres[i] == null) {
				lista.add(i);
			}
		}
		
		System.out.println("Las posiciones vacías son: " + lista);
		
		
		
		
		
		
		
		
		
		

	}

}
