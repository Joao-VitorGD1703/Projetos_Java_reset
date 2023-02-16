package metodos2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x =0;

		System.out.print("Digite um valor inteiro -->");
		x = sc.nextInt();
		divisores(x);
	}
	
	public static void divisores(int x) {
		
		for(int i = -x; i<=x; i++) {
			if( i != 0 &&  x % i == 0) {
				 
				System.out.print(i + " ");
			}
		}
		
		
	}

}
