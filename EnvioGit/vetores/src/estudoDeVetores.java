import java.util.Scanner;

public class estudoDeVetores {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	final int N = 10;
	int[] numeros = new int[N];
	int maiorNumero=0;
	int menorNumero=0;
	int t =0;
	
	int n =0;
	System.out.println("Digite valor -1 para finalizar cadastro de números:");
	int r =sc.nextInt();
	while(r > 0 && n<N) {
		numeros[n] =r;
		n++;
		System.out.print("Digite valor -1 para finalizar cadastro ou RM: ");
		r = sc.nextInt();
	}
	
	for(int i= 0; i<numeros.length; i++) {
		if(numeros[i] > t) {
			maiorNumero=numeros[i];
			t=numeros[i];
		}
	}
	
	for(int i= 0; i<numeros.length; i++) {
		if(numeros[i] < t) {
			menorNumero=numeros[i];
			t=numeros[i];
		}
	}
	
	System.out.print("Maior número: " + maiorNumero);
	System.out.println();
	System.out.print("Menor número: " + menorNumero);
	

	}

}
