import java.util.Scanner;

public class temperatuta_dois {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double[] temperatura = new double[7];
		double t =0;
		
		for(int i =0; i<temperatura.length; i++) {
			System.out.println("Digite a temperatura do dia " + i);
			temperatura[i] = sc.nextDouble();
		}
		
		for(int i =0; i<temperatura.length; i++) {
			t = t + temperatura[i];
		}
		
		System.out.println( "Temperatura média: " + t/7);
		
		for(int j =0; j<temperatura.length; j++) {
			if(temperatura[j] > t) {
				System.out.println("No dia " + j + " a temperatura excedeu a media de " + t + " com a temperatura do dia sendo " + temperatura[j]);
			}
		}
		
		System.out.println("cabo");

	}

}
