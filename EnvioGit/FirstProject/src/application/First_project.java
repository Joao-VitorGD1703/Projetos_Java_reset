package application;

import java.util.Scanner;

public class First_project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Ol� Jogador n�mero12 seja bem vindo bem-vindo ao JavaKingdown. "
    		+ "Mas antes de adentrar nosso reino voc� devera responder algumas pergunstas "
    		+ "de hist�ria geral!!! Nossa ja ia me esquecendo, Qual o seu nome?");
		
		System.out.print("escreva seu nome: " );
		String nome = sc.next();
		System.out.println();
		
		System.out.println("Ent�o seja bem vindo " + nome + " , Apartir de agora te chamarei assim, "
				+ "ja que conhe�o seu nome gostaria de saber sua idade, "
				+ "mas antes quero saber a que nivel est� minha matem�tica. em que ano voc� nasceu? ");
	   
		
		System.out.print("Digite o ano que voc� nasceu: ");		
		int ano = sc.nextInt();
	    int y = 2021 - ano;
	    System.out.println();
	   
	    System.out.println("Vejamos... " + y + " Eu acertei? "
	    		+ "Vej� s� n�o estou t�o mal assim hahahah. "
	    		+ "Voc� � jovem em!!! eu tenho 987645235 Anos. "
	    		+ "Por isso conhe�o muito sobre hist�ria. "
	    		+ "Vamos ver o seu nivel de magn�fica diciplina.");
		
		
	    System.out.println(" Voc� quer participar?  "
				+ "responda (s) para sim e (n) para n�o.");
		
		System.out.println();
				
		String resp = sc.next();
	    

		if(resp.equals("s")) {
			
		    System.out.println("Fico feliz com sua resposta. Ok vamos come�aar!!!");
		
		    
		    // fa�a while para as perguntas sobre hist�ria
	  } else if (resp.equals("n")) {
    	        System.out.println("Game Over, infelizmente voc� n�o pode entrar no JavaKingdown.");
    
	  } else {
		  System.out.println("Game Over, infelizmente voc� n�o pode entrar no JavaKingdown.");
	  }
	   
	
		
	    System.out.println();
		
		
		
		sc.close();
	}

}
