package estudoDemetodos;

import java.util.Scanner;

public class methodos1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	
		int r;
		r=soma(1, 5, 10, 3, 20, 2);
		System.out.println("A soma dos numeros = " + r);

	}
	
	public static int soma(int... numeros) {
		int res =0;
		for( int n: numeros) {
			res += n;
		}
		return res;
		
		
		
	}
	
	public static int soma2(int n1, int n2) {
		// retorna
		int res = n1 + n2;
		
		return res;
		
	}
	
	public static void msg(String m, int n2) {
		// não retorna nada
		for(int i=0; i<n2; i++) {
			System.out.println(m);
		}
		
	}

}
