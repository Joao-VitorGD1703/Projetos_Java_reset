import java.util.Random;

public class somarrArry {

	public static void main(String[] args) {
		int[] x = new int[10];
		
		imprimir(x, x);

	}
	
	public static void gerar(int[] x) {
		Random gerador = new Random();
		
		for(int i =0; i<x.length; i++) {
			x[i] = gerador.nextInt(5);
			System.out.print(x[i] + " ");
		}
	}
	
	public static int soma(int[]x) {
		int total = 0;
		for( int k = total; k<x.length; k++) {
			total += x[k];
		}
		return total;
		
	}
	
	public static int maior(int[]x) {
		int resp = 0;
		int parametros = 0;
		int finalizar = 0;
		for( int k = resp; k<x.length; k++) {
			if(x[k] > parametros) {
				parametros = x[k];
				finalizar = x[k];
			}
		}
		return finalizar;
		
	}
	
	public static int[] menorMaior(int[]x) {
		int resp = 0;
		int parametros = 0;
		int finalizar2 = 0;
		int finalizar = 0;
		int[] y = new int[2];
		for( int k = resp; k<x.length; k++) {
			if(x[k] < parametros) {
				parametros = x[k];
				finalizar2 = x[k];
			}
			if(x[k] > parametros) {
				parametros = x[k];
				finalizar = x[k];
			}
		}
		
		y[0] = finalizar;
		y[1] = finalizar2;
		return y;
		
	}
	
	public static void imprimir(int[]x, int[]y) {
		gerar(x);
		System.out.println();
		System.out.println("Maior = " + y[1] );
		System.out.println("Menor = " + y[0] );
		
		System.out.println("Total = " + soma(x));
		
	}

}
