package estudoDemetodos;

import java.util.Scanner;

public class lerOMaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int n1, n2, n3;
		System.out.println("Digite tres valores e veja o maior entre eles: ");
		System.out.println("Digite o primeiro valor");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro valor");
		n3 = sc.nextInt();
		
		System.out.println("Maior Valor = " + valorFinal(n1, n2, n3));
		
		

	}
	
	public static int valorFinal(int n1, int n2, int n3) {
		if(n1> n2 && n1>n3) {
			return n1;
		}else if(n2>n1 && n2>n3) {
			return n2;
		}else {
			return n3;
		}
	}

}
