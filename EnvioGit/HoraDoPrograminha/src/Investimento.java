import java.util.Scanner;

public class Investimento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double m, t, c, i, l;
		
		System.out.println("Vejá quando rendera seu investimento daqui alguns meses!!!");
		
		System.out.print("Quanto será seu capital inicial de investimento: ");
		c = sc.nextDouble();
		
		System.out.print("Por qaunto tempo em meses deixará investido: ");
		t = sc.nextDouble();
		
		System.out.print(" qual será a taxa de rendimento ao mês: ");
		i = sc.nextDouble();
		
		m = c* Math.pow(1 + i/100, t);
		
		System.out.printf("o montante final do seu investimento será de: %.2f " , m);
		System.out.println();
		
		
		l = m - c;
		System.out.printf("seu lucro srá de: %.2f " , l);
		
		
		
		
	}
}
