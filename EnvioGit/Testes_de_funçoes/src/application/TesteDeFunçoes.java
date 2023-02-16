package application;

import java.util.Scanner;

public class TesteDeFunçoes {

	private static final String Constantino = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Responda a pergunda:");
		int  resp = 0;
		System.out.println("quando começou a primeira guerra mundial? ");
		while(resp != 1914) {
			 resp = sc.nextInt();
		
		}
		
		System.out.println("Parabéns você acertou!!!");
		
		
		System.out.println("Vamos para a próxima pergunta...");
		System.out.println("Responda a segunda pergunta: ");
        System.out.println();
		int resp2 = 0;
		System.out.println("quando acaboua a segunda guerra mundial?");
		while(resp2 != 1945) {
			resp2 = sc.nextInt();
		}
		
		System.out.println("Parabéns você acertou!!!");
		
		
		System.out.println("Vamos para a próxima pergunta...");
		System.out.println("Responda a terceira pergunta: ");
        System.out.println();
		String resp3 = "";
		System.out.println("Quem foi o primeiro imperador de Constatinopla?");
		while(resp3 !=  Constantino){
			resp3 = sc.next();
		}
        
        sc.close();
}

}
