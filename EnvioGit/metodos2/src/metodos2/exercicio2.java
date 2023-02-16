package metodos2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double la, lb, lc;
		
		System.out.println("Digite os valores: ");
		System.out.print("Digite o valor do lado A: ");
		la = sc.nextDouble();
		
		System.out.print("Digite o valor do lado B: ");
		lb = sc.nextDouble();
		
		System.out.print("Digite o valor do lado C: ");
		lc = sc.nextDouble();
		if(la + lb > lc && lb + lc > la && lc + la > lb ) {
			triangulo(la, lb, lc);
		}else {
			System.out.println("não da para formar um triangulo");
		}

	}
	
	public static void triangulo(double la, double lb, double lc) {
		if(la == lb && lb == lc) {
			System.out.println("Estes valores geram um triangulo: Equilatero");
		}else if(la !=lb && lb != lc && lc != la) {
			System.out.println("Estes valores geram um triangulo: Escaleno");
			
		}else {
			System.out.println("Estes valores geram um triangulo: Isociles");
		}
		
	}

}
