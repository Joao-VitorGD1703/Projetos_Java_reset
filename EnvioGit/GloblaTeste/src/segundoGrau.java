import java.util.Scanner;

public class segundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta;
		double []x;
		
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
				x = calcular(a, b, delta);
				System.out.println("Resultado de x1 =" + x[0]);
				System.out.println("Resultado de x1 =" + x[1]);

			}
		}

	}
	
	public static double delta(double a, double b, double c) {
		
		return b * b -4 * a * c;
		
	}
	
	public static double[] calcular(double a, double b, double delta) {
		double[] x = new double [2];
		x[0] = ((-b + Math.sqrt(delta))/(2*a));
		x[1] = ((-b - Math.sqrt(delta))/(2*a));
		
		return x;
	}

}
