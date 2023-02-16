package estudoDemetodos;

import java.util.Random;
import java.util.Scanner;

public class exMetodoMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		int[] total;
		

		preencher(x);
		imprimir(x);
		total = ParEImpar(x);
		
		System.out.println("\nTotal de pares = " + total[0]);
		System.out.println("\nTotal de impares = " + total[1]);

	}

	public static void preencher(int[] x) {
		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(20);
			
		}

	}
	public static void imprimir(int[]x) {
		for(int i: x) {
			System.out.print(i + " ");
		}
		
	}
	
	public static int[] ParEImpar(int[]x) {
		int[] total = new int[2];
		
		for (int i : x) {
		
			if(i % 2 ==0) {
				total[0]++;
			}else {
				total[1]++;
			}
		}
		return total;
		
	}
	

}
