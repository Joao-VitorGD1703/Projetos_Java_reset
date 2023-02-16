package appliction;

import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número e veja seu divisor:");
		int num = sc.nextInt();

		//num/i != 0
		for(int i= 1; num/i != 0 ; i++ ) {
			if(num/i != 0) {
				System.out.println("Divida o número " +num+ "  por " + i+  " se o resto for 0 o programa acaba");
			}else {
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println("o numero acima tem como resto 0" );
		
		
		sc.close();
	}

}
