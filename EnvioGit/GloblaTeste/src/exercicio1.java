import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um n�mero inteiro e positivo, e veja os seus divisores ");
		System.out.print("Digite o n�mero --> ");
		int num = sc.nextInt();
		if(num > 0) {
			calcular(num);
		}else {
			System.out.println("N�mero inv�lido");
		}	
	}
	
	public static void calcular(int x) {
		
		for(int i = -x; i<=x ; i++) {
			if(i != 0 && x % i == 0 ) {
				System.out.print(i + " ");
			}
		}
		
	}

}
