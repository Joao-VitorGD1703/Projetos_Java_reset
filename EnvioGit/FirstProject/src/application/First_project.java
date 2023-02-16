package application;

import java.util.Scanner;

public class First_project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Olá Jogador número12 seja bem vindo bem-vindo ao JavaKingdown. "
    		+ "Mas antes de adentrar nosso reino você devera responder algumas pergunstas "
    		+ "de história geral!!! Nossa ja ia me esquecendo, Qual o seu nome?");
		
		System.out.print("escreva seu nome: " );
		String nome = sc.next();
		System.out.println();
		
		System.out.println("Então seja bem vindo " + nome + " , Apartir de agora te chamarei assim, "
				+ "ja que conheço seu nome gostaria de saber sua idade, "
				+ "mas antes quero saber a que nivel está minha matemática. em que ano você nasceu? ");
	   
		
		System.out.print("Digite o ano que você nasceu: ");		
		int ano = sc.nextInt();
	    int y = 2021 - ano;
	    System.out.println();
	   
	    System.out.println("Vejamos... " + y + " Eu acertei? "
	    		+ "Vejá só não estou tão mal assim hahahah. "
	    		+ "Você é jovem em!!! eu tenho 987645235 Anos. "
	    		+ "Por isso conheço muito sobre história. "
	    		+ "Vamos ver o seu nivel de magnífica diciplina.");
		
		
	    System.out.println(" Você quer participar?  "
				+ "responda (s) para sim e (n) para não.");
		
		System.out.println();
				
		String resp = sc.next();
	    

		if(resp.equals("s")) {
			
		    System.out.println("Fico feliz com sua resposta. Ok vamos começaar!!!");
		
		    
		    // faça while para as perguntas sobre história
	  } else if (resp.equals("n")) {
    	        System.out.println("Game Over, infelizmente você não pode entrar no JavaKingdown.");
    
	  } else {
		  System.out.println("Game Over, infelizmente você não pode entrar no JavaKingdown.");
	  }
	   
	
		
	    System.out.println();
		
		
		
		sc.close();
	}

}
