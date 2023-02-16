import java.util.Random;

public class exercicio5 {

	public static void main(String[] args) {
		int[] x = new  int [10];
		imprimir(x, x);

	}
	public static void prencher(int[]x) {
		Random gerador = new Random();
		System.out.println("Vetor normal");
		for(int i =0; i<x.length; i++) {
			x[i] = gerador.nextInt(20);
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void inverter(int[]x) {
		System.out.println("Vetor invertido");
		for(int j = x.length -1; j>=0; j--) {
			x[j] = j;
			System.out.print(j + " ");
		}
	}
	
	public static void imprimir(int x1[], int x2[]) {
		prencher(x1);
		inverter(x2);
	}
	
	
}
