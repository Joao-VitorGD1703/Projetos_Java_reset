import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero inteiro e positivo eveja seus divisores");
		System.out.print("Digite o numero = ");
		numero = sc.nextInt();
		
		if(numero <= 0) {
			System.out.println("numero invalido, tente novamente com um numero inteiro e positivo.");
		}else {
			calculo(numero);
		}

	}
	
	public static void calculo(int numero) {
		for (int cont = -numero; cont<=numero; cont++) {
			if(cont != 0 && numero % cont ==0) {
				System.out.print(cont + " ");
			}
			
		}
		
	}
	
	
	

}
