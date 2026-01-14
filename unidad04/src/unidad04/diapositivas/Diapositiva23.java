package unidad04.diapositivas;

public class Diapositiva23 {

	public static void main(String[] args) {

		int[] t = {-9,-6,-2,-1};
		
		System.out.println(maximo(t));
		

	}
	
	public static int maximo(int[] array) {
		int max = array[0];
		
		for(int elem : array) {
			if(elem > max) {
				max = elem;
			}
		}
		
		return max;
	}

}
