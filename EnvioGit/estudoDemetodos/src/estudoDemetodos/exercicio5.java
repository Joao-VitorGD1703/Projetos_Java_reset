package estudoDemetodos;

import java.util.Random;

public class exercicio5 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		mostrarTela(arr, arr);
		

	}

	public static void array(int[] arr) {
		Random gerador = new Random();
		System.out.print("Veotr normal: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = gerador.nextInt(20);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void arrayOposto(int[] arr) {
		System.out.print("Veotr invertido: ");
		for(int j = arr.length -1; j>=0; j-- ) {
			System.out.print(arr[j] + " ");
		}
	}
	
	public static void mostrarTela(int[] arr, int[] arr2) {
		array(arr);
		arrayOposto(arr2);
	}

}
