package unidad04.diapositivas;

public class Diapositiva23 {

	public static void main(String[] args) {

		int[] t = {-9,-6,-2,-1};
		
		System.out.println(maximo(t));
		

	}
	
	public static int maximo(int[] t) {
		int maximo = 0;
		
		for(int elem : t) {
			if(elem > maximo) {
				maximo = elem;
			}
		}
		
		return maximo;
	}

}
