import java.util.Scanner;

public class Investimento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double m, t, c, i, l;
		
		System.out.println("Vej� quando rendera seu investimento daqui alguns meses!!!");
		
		System.out.print("Quanto ser� seu capital inicial de investimento: ");
		c = sc.nextDouble();
		
		System.out.print("Por qaunto tempo em meses deixar� investido: ");
		t = sc.nextDouble();
		
		System.out.print(" qual ser� a taxa de rendimento ao m�s: ");
		i = sc.nextDouble();
		
		m = c* Math.pow(1 + i/100, t);
		
		System.out.printf("o montante final do seu investimento ser� de: %.2f " , m);
		System.out.println();
		
		
		l = m - c;
		System.out.printf("seu lucro sr� de: %.2f " , l);
		
		
		
		
	}
}
