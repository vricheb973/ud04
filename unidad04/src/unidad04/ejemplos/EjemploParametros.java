package unidad04.ejemplos;

public class EjemploParametros {

	public static void main(String[] args) {
		
//		int n = 1;
//		
//		funcion1(n);
//		
//		System.out.println(n);
		

		int[] array = {3,6,9,8};
		
		funcion2(array);
		
		System.out.println(array);
	}

	public static void funcion1(int numero) {
		numero = 133;
	}
	
	public static void funcion2(int[] array2) {
		array2[0] = 9;
		array2[1] = 9;
		System.out.println(array2);
	}
	
}
