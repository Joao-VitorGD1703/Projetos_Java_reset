import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int deltaResp =0;
		int x1Resp=0;
		int x2Resp=0 ;

		System.out.println("Digite o valor do termo a -->");
		a = sc.nextInt();
		if (a > 0) {
			System.out.println("Digite o valor do termo b -->");
			b = sc.nextInt();

			System.out.println("Digite o valor do termo c -->");
			c = sc.nextInt();

			deltaResp = delta(a, b, c);
			if (deltaResp > 0) {

				x1Resp = x1( a, b, deltaResp);
				x2Resp = x2( a, b, deltaResp );
				
				System.out.println("Valor de x1 = " + x1Resp);
				System.out.println("Valor de x2 = " + x2Resp);

			}else {
				System.out.println("raiz não é real");
			}

		} else {
			System.out.println("Se o termo a = 0, não é possivel formar uma equação.");
		}

	}

	public static int delta(int a, int b, int c) {

		return  b * b - 4 * a * c;
		

	}

	public static int x1(int a, int b, int delta ) {
		
		return  (int) ((-b + Math.sqrt(delta)) / (2*a));
		

	}

	public static int x2(int a, int b, int delta) {
		return (int) ((-b - Math.sqrt(delta)) / (2*a));
		

	}

}
