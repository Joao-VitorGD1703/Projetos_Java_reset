import java.util.Scanner;

public class exercico3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, resp;
		System.out.println("Digite três valores inteiros e veja o maior entre esles");
		

		System.out.print("Digite o primeiro valor -->");
		a= sc.nextInt();
		System.out.print("Digite o segundo valor -->");
		b= sc.nextInt();
		System.out.print("Digite o terceiro valor -->");
		c= sc.nextInt();

		resp = calcular(a, b, c);
		
		System.out.println("O maior número é : " + resp );
	}

	public static int calcular(int a, int b, int c) {
		if(a >b) {
			return a;
		}else if( b>c) {
			return b;
			
		}else {
			return c;
		}
	}
}
