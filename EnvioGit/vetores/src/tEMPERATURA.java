import java.util.Scanner;

public class tEMPERATURA {
	
	public static void temperatura(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] temperatura = new double[7];
		double t =0;
		
		for(int i =0; i<temperatura.length; i++) {
			System.out.println("Digite a temperatura do dia " + i);
			temperatura[i] = sc.nextDouble();
		}
		
		for(int i =0; i<temperatura.length; i++) {
			t =+ temperatura[i];
		}
		System.out.println(t);
		System.out.println(t/7);
		
		
		
	}

}
