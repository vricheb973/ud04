package ejerciciosUD04;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {

		temperaturas();

	}
	
	public static void temperaturas() {
		Scanner sc = new Scanner(System.in);
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int[] temperaturas = new int[12];
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("Dime la temperatura de " + meses[i] +":");
			temperaturas[i] = sc.nextInt();
		}
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.print(meses[i]);
			for(int j=0; j<temperaturas[i]; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
	}

}
