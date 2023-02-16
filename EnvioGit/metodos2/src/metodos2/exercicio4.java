package metodos2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, deltaresp, x1resp, x2resp;
		
		System.out.println("Digite os valores: ");
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		if( a !=0) {
			
			System.out.print("Digite o valor de B: ");
			b = sc.nextInt();
			
			System.out.print("Digite o valor de C: ");
			c = sc.nextInt();
			
			deltaresp = delta(a, b, c);
			if(deltaresp > 0) {
				x1resp = x1(a, b, deltaresp);
				x2resp = x2(a, b, deltaresp);
				System.out.println("X1 = " + x1resp);
				System.out.println("X2 = " + x2resp);
				
				
			}else {
				System.out.println("Delta não é real");
			}
			
		}else {
			System.out.println("não");
		}
		
	}
	public static int delta(int a, int b, int c) {
		
		return b * b -4 * a * b;
	}
	
	public static int x1(int a, int b, int delta) {
		
		return (int) ((-b + (Math.sqrt(delta)))/(2 * a));
	}
    public static int x2(int a, int b, int delta) {
		
		return (int) ((-b - (Math.sqrt(delta)))/(2 * a));
	}

}
