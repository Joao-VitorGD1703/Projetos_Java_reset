import java.util.Random;

public class exercicio6 {

	public static void main(String[] args) {
		int[] x = new int [10];
		int[] valor;
		valor = imprimir(x, x, x);
		vetor(x);
		System.out.print("Maior valor = " + valor[0]);
		System.out.println();
		System.out.print("Menor valor = " + valor[1]);

	}
	
	public static void vetor(int[]x) {
		Random gerador = new Random();
		System.out.println("vetor: ");
		for(int i =0; i<x.length; i++) {
			x[i]= gerador.nextInt(20);
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	
	public static int maior(int[]x) {
		int valorGrande =0;
		for(int j = 0; j<x.length; j++) {
			if(x[j] > valorGrande) {
				valorGrande = x[j];
				
			}
		}
		return valorGrande;
	}
	
	public static int menor(int[]x) {
		System.out.println();
		int valorPequeno =20;
		for(int j = 0; j<x.length; j++) {
			if(x[j] < valorPequeno) {
				valorPequeno = x[j];
				
			}
		}
		return valorPequeno;
	}
	
	public static int[] imprimir( int[] x, int[]y, int[]z) {
		int valorMaior = maior(x);
		int valorMenor =menor(y);
		int[] resp = new int [2];
		
		for(int j = 0; j<x.length; j++) {
			if(x[j] < valorMenor) {
				valorMenor = x[j];
				
			}
			
			if(x[j] > valorMaior) {
				valorMaior = x[j];
				
			}
			
		}
		
		for(int k = 0; k<x.length; k++) {
			
			
			if(x[k] > valorMaior) {
				valorMaior = x[k];
				
			}
			
		}
		
		
		resp[0] = valorMaior;
		resp[1] = valorMenor;
		return z;
		
	}

}
