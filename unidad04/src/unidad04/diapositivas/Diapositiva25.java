package unidad04.diapositivas;

import java.util.Arrays;
import java.util.Random;

public class Diapositiva25 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(rellenaPares(10, 10)));
		

	}
	
	public static int[] rellenaPares(int tam, int fin) {
		int[] array = new int[tam];
		Random r = new Random();
		
		for(int i=0; i<array.length; i++) {
			int aleatorio;
			do {
				aleatorio = r.nextInt(2, fin+1);
			}while(aleatorio%2 != 0);
			
			array[i] = aleatorio;
			
		}
		
		Arrays.sort(array);
		return array;
	}

}
