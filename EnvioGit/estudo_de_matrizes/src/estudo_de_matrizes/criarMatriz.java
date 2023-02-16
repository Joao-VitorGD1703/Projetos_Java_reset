package estudo_de_matrizes;

import java.util.Random;
import java.util.Scanner;

public class criarMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		int[][] matrizA = new int[3][2];
		int[][] matrizB = new int[3][2];
		int[][] matrizC = new int[2][3];

		System.out.println("Matriz A------>");
		for(int i =0; i<matrizA.length  ; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				matrizA[i][j] = gerador.nextInt(5);
				System.out.print(matrizA[i][j] + "\t");
			}
			System.out.println();
			
		}
		
		System.out.println("Matiz B---->");
		for(int i =0; i<matrizB.length  ; i++) {
			for(int j=0; j<matrizB[i].length; j++) {
				matrizB[i][j] = gerador.nextInt(5);
				System.out.print(matrizB[i][j] + "\t");
			}
			System.out.println();
			
		}
		
		System.out.println("Matriz A virada ---------->");
		for(int i =0; i<matrizA.length  ; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				matrizC[i][j] =matrizA[j][i];
				System.out.print(matrizC[j][i] + "\t");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		

	}

}
