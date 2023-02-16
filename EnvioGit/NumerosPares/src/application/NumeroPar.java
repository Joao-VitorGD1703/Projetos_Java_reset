package application;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//SISTEMA QUE IDENTIFICA NUMEROS PARES
		/*System.out.println("Numeros pares: ");
		for(int i =0; i<=20; i++) {
			if( i % 2 == 0) {
				System.out.println("Numeros pares: " + i);
			}else {
				System.out.println("Números Impares");
			}
		}*/
		
		

		// SISTEMA QUE FAZ ANALISE DE GRANDEZA
		/*System.out.println("Digite dois números, eveja qual é o maior: ");
		
		int  a = sc.nextInt();
		int  b = sc.nextInt();
		
		System.out.println("os números são: " + a + " e " +b);

		if( a > b) {
			System.out.println("O número " + a + " é maior que " + b);
		}else {
			System.out.println("O número " + b + " é maior que " + a);
		}*/
		
		
		// SISTEMA QUE MOSTRE TODOS OS NÚMEROS ENTRE 100 E 200
		/*int i = 100;
		 while( i<= 200) {
			 if(i % 2 != 0) {
				 System.out.println("números impares: " + i);
			 }
			i += 1;
		 }*/
		
		/*int total = 0;
		int cont = 1;
		
		while(cont <= 500) {
			if(cont % 3 ==0) {
				total = total + cont;
				System.out.println("A soma dos multiplo de 3 : " + total);
			}
			cont += 2;
		}*/
		
		/*int i = 1000;
				
				while(i <= 10000) {
					if( i % 2 ==0) {
						System.out.println("numeros pares: "+ i);
					}
					i ++;
				}*/
		
		/*int diaria;
		double valor;
		
		System.out.println("Digite o número de dias que ficará hospedado");
		diaria = sc.nextInt();
		
		if( diaria > 15) {
			valor = diaria * 15.50;
			System.out.println("Número de dias hospedado " + diaria + ", Valor: " + valor);
		}else if(diaria == 15) {
			valor = diaria * 36.00;
			System.out.println("Número de dias hospedado " + diaria +  ", Valor: " + valor);
		}else {
			valor = diaria * 58.00;
			System.out.println("Número de dias hospedado " + diaria + ", Valor: " + valor);
		}*/
		
		
		/* PESO HOMEM E MULHER
		  String nome, genero;
		 
		double h, formula;
		
		genero = null;
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Digite sua altura: ");
		h = sc.nextDouble();
		
		System.out.print("Digite seu genero (masculino / femenino) letras minusculas: ");
		genero = sc.next();
		
		if(genero.equals("masculino")){
			formula = 72.7*h-58;
			System.out.println("Peso ideal para " + nome + " é de " + String.format("%.2f", formula)+ " KG");
			
		}else if(genero.equals("femenino")) {
			
			formula = 62.1*h-42.7;
			System.out.println("Peso ideal para " + nome + " é de " + String.format("%.2f", formula)+ " KG");
			
		}else {
			System.out.println("entrada de dado não valido");
		}*/
		
		
		/* equação segundo grau
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite o valor de a");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de b");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de c");
		c = sc.nextInt();
		
		if(a!=0) {
			delta = b*b + (-4 * a * c);
			
			if(delta > 0) {
				x1 = (- b + Math.sqrt(delta))/ (2 *a);
				x2 = (- b - Math.sqrt(delta))/ (2 *a);
				
				System.out.println("As raizes são respectivamente: x1 = " +x1+ " x2 = " + x2);
			}else {
				System.out.println("Delta não tem raiz real.");
			}
			
		}else {
			System.out.println("não é possivel");
		}*/
		
		
		int a, b, c;
		
		System.out.println("Digite o valor de A");
		a =sc.nextInt();
		System.out.println("Digite o valor de B");
		b =sc.nextInt();
		System.out.println("Digite o valor de C");
		c =sc.nextInt();
		
		if(a != b && a !=c && b!=c) {
			
			if(a>b && b>c) {
				System.out.println("menor =" + c);
			}if(a>c && c>b) {
				
				System.out.println("menor =" + b);
				
			}if(c>b && b>a) {
				
				System.out.println("menor =" + a);
				
			}if(c>a && a>b) {
				
				System.out.println("menor =" + b);
				
			}if(b>a && a>c) {
				
				System.out.println("menor =" + b);
			}
			
			
		}else {
			System.out.println("Valores iguais");
		}
		
		
	}

}
