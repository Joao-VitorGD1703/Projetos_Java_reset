import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de atividades para que a m�dia seja feita.");
		int numeroDeNotas = sc.nextInt();
		
		double v1[] = new double[numeroDeNotas];
		//int i = sc.nextInt();
		double media = 0;
		double resultado;
		
		
		for (int i = sc.nextInt(); i<numeroDeNotas; i++) {
			media = media + v1[i];
		}
		
		resultado = media / numeroDeNotas;
		
		System.out.println("Sua m�dia � de: " + resultado);
		
		
		
	}

}
