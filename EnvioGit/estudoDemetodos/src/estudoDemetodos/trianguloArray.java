package estudoDemetodos;

import java.util.Scanner;

public class trianguloArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int numero =0;
		
		System.out.print("quantos numeros quer comparar: ");
		numero = sc.nextInt();
		int[] arr = new int[numero];
		for(int i =0; i <arr.length; i++) {
			System.out.println("digite um valor");
			arr[i] = sc.nextInt();
		
		}
	
		resultado(arr);
	}
	
	public static void resultado(int[] arr) {
	
		int fim =0;
		int comparador = 0;
		for(int i = 0; i<arr.length; i++) {
			if(comparador < arr[i]) {
				comparador = arr[i];
				fim = comparador;
			}
		}
		System.out.println("Maior numero é: " + fim);
	}

}
