package unidad04.diapositivas;

public class Quicksort {

	public static void main(String[] args) {
		
	}
	
	public static void quicksort(int[] array, int izq, int der) {
		int i = izq;
		int j = der;
		int p = array[0];
		
		while(i<=j) {
			while(array[i] < p) {
				i++;
			}
			while(array[j] > p) {
				j--;
			}
			
			if(i <= j) {
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
				j--;
			}
			
			if(izq < j) {
				quicksort(array, izq, j);
			}
			if(i < der) {
				quicksort(array, i, der);
			}
		}
		
		
		
	}

}
