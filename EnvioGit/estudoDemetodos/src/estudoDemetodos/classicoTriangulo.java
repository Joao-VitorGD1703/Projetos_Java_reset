package estudoDemetodos;

import java.util.Scanner;

public class classicoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double n1, n2, n3;
		System.out.println("Digite 3 valores e veja o qual tipo de triangulo.");
		System.out.print("Digite o primeiro valor = ");
		n1 = sc.nextDouble();
		System.out.print("Digite o segundo valor = ");
		n2 = sc.nextDouble();
		System.out.print("Digite o terceiro valor = ");
		n3 = sc.nextDouble();
		
		if(n1 + n2 > n3 && n2 + n3 > n1 && n1 + n3> n2) {
			tri(n1, n2, n3);
		}else {
			System.out.println("Os valores digitados nao formam um triangulo");
		}
		

	}
	
	public static void tri(double n1, double n2, double n3) {
		if(n1 == n2 && n2==n3) {
			System.out.println("Triângulos equilátero");
			
		}else if(n1 != n2 && n1 != n3 && n2 != n3) {
		
			System.out.println("Triângulo escaleno");
		}else {
			System.out.println("Triângulo isósceles");
		}
	}
	
	

}
