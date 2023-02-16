package metodos2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, resp;
		
		System.out.println("Digite os valores: ");
		System.out.print("Digite o valor do lado A: ");
		a = sc.nextInt();
		
		System.out.print("Digite o valor do lado B: ");
		b = sc.nextInt();
		
		System.out.print("Digite o valor do lado C: ");
		c = sc.nextInt();
		
		resp = maiorValor(a, b, c);
		
		System.out.print("O Maior numero digitado é: " + resp );

	}
	
	public static int maiorValor(int a, int b, int c) {
		if(a > b && b >c) {
			return a;
		}else if(b > a && b>c) {
			return b;
		}else {
		
			return c;
		}
	}

}
