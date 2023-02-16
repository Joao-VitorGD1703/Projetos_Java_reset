package estudoDemetodos;

import java.util.Scanner;

public class raizesMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c, x1, x2, delta;

		System.out.println("Digite os termos para acharmos as raizes da equacao");
		System.out.print("Digite o termo A da equação de segundo grau");
		a = sc.nextDouble();
		if (a == 0) {
			System.out.println("Não é possivel formar uma equacao de segundo grau");
		} else {

			System.out.print("Digite o termo B da equação de segundo grau");
			b = sc.nextDouble();
			System.out.print("Digite o termo C da equação de segundo grau");
			c = sc.nextDouble();

			delta = delta(a, b, c);

			if (delta < 0) {
				System.out.println("Não é possui raiz real");
			} else {
				x1 = x1(a, b, delta);
				x2 = x2(a, b, delta);
				System.out.println("Resultado de x1 =" + x1);
				System.out.println("Resultado de x1 =" + x2);

			}
		}

	}

	public static double delta(double a, double b, double c) {
		return Math.pow(b, 2) - 4 * a * c;

	}

	public static double x1(double a, double b, double delta) {

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		return x1;

	}

	public static double x2(double a, double b, double delta) {

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		return x2;

	}

}
