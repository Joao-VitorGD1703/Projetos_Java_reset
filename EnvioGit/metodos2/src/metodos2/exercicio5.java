package metodos2;

import java.util.Random;

public class exercicio5 {

	public static void main(String[] args) {
		int[]x = new int[10];
		int[]y = new int[10];
		aleatorio(x);
		imprimir(x);
		imprimir2(y);

	}
	public static void aleatorio(int[]x) {
		Random gerador = new Random();
		for(int i =0; i< x.length; i++) {
			x[i] = gerador.nextInt(20);	
			System.out.println(i + " ");
		}
	}
	public static void aleatorioReverse(int[]x) {
		for(int j =x.length -1; j>=0; j--) {
			x[j] = j;	
			System.out.println(j + " ");
		}
	}
	public static void imprimir(int[]x) {
		
		
    }
	public static void imprimir2(int[]y) {

		
    }
	

}
