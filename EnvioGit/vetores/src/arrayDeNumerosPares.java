import java.util.Iterator;
import java.util.Scanner;

public class arrayDeNumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N =10;
		
		
		int[] numeros = new int[N];
		int[] numerosPares = new int[N];
		int[] numerosImpares = new int[N];
		
		
		int n =0;
		
		System.out.println("Digite um n�mero inteiro e positivo ou -1 para incerrar");
		int r = sc.nextInt();
		
		while(r > 0 && n<N) {
			numeros[n] = r;
			n++;
			System.out.println("Digite um n�mero inteiro e positivo ou -1 para incerrar");
			 r = sc.nextInt();
		}
		int a =0;
		int b =0;
		for(int i =0; i<numeros.length; i++) {
			if(numeros[i] % 2 ==0) {
				numerosPares[a] = numeros[i];
				a++;
			}else {
				numerosImpares[b] = numeros[i];
				b++;
			}
		}
		
		System.out.print("N�meros pares: ");
		for(int i =0; i< a; i++) {
			System.out.print(  numerosPares[i] + ", ");
			
		}
		System.out.println();
		
		System.out.print("N�meros impares: ");
		for(int i =0; i< b; i++) {
			System.out.print( numerosImpares[i] + ", "  );
			
		}

	}

}
