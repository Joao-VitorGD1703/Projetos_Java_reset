package estudo_estruturasDeRepeti��o;

import java.util.Scanner;

public class estruturasDeRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		// soma  de numeros pares em um espa�o de 0 a 10
		int cont =1, soma = 0;
		
		while(cont < 10) {
			if(cont %2 ==0) {
				
				soma = soma + cont;
			}
			cont++;
		}
		System.out.println("Soma dos n�meros pares = " + soma);*/
		
		
		/*
		// media de alunos
		double nota1, nota2, media;
		int cont = 1, n;
		
		System.out.println("Digite o n�mero de alunos a que ser�o calculados");
		n = sc.nextInt();
		
		while(cont <= n){
			System.out.println("Digite a primeira nota:");
			nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota:");
			nota2 = sc.nextDouble();
			media = (nota1 + nota2)/2; 
			System.out.print("M�dia do aluno " + cont);
			System.out.println(" = " + media);
			cont++;
			System.out.println();
		}
		
		System.out.println("Fim");*/
		
		
		
		// ex2
		int num1, num2;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = sc.nextInt();
		
		System.out.println("digite o segundo valor: ");
		num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0&& num2 > num1) {
			while(num1 <= num2) {
				System.out.println("Num: " + num1 );
				num1 ++;
			}
			
		}else {
			System.out.println("Valores invalidos, lembrando que os n�meros devem ser positivos e o segundo valor deve ser maior que o primeiro");
		}
		
		
		/* 
		 //IMPRIMA O MAIOR N�MERO
		int num, i=0, numM = 0, d = 0;
		String resp = null;
		
		while(i < 4) {
			System.out.println("Digite o n�mero");
			num = sc.nextInt();
			
			d = num;
			if(d > numM) {
				numM = d;
			}
			
			i++;
		}
		System.out.println("o maior n�mero: " + numM);*/
		
		
		/*
		//tabuada

		int tabuada, i=1, g, e=1,b=0,  res;
		String resp = null;
		
		System.out.println("desja iniciar ?");
		resp = sc.nextLine();
		
		do {
			resp = null;
			i =0;
			System.out.println("Digite a tabuada a ser executada");
			tabuada = sc.nextInt();
			while(i < 10) {	
				g = i * tabuada;
				
				System.out.println( i + " X " + tabuada + " = " + g);	
				i++;
			   }
			System.out.println("desja iniciar ?");
			resp = sc.next();	
			
		}while(resp.equals("sim"));
		
	System.out.println("FIM");*/
		
		/*
		//fatorial
		int n, i=1, f=1;
		
		System.out.println("Digite um n�mero e veja seu fatorial");
		n = sc.nextInt();
		System.out.println("!"+n);
		i=n;
		while(i>=1) {
			f = f*i;
			System.out.println("*"+i);
			i--;
		}
		System.out.println("fatorial " + f);*/
		
		/*
	//sequ�ncia logica de divis�o de numero 	
		double y;
		int i=1, n;
		
		System.out.println("Digite o numero:");
		n = sc.nextInt();
		
		while(i<n) {
			y = (double)1/i;
			System.out.println("Resposta: " + String.format("%.4f", y) );
			
			i++;
		}*/
		
		
		
		
		/*
		// multiplica��o sem o uso de "*"
		double a, i=1, b, cont, resp=0;
		
		System.out.println("Digite o 1 numero que deseja multiplicar ");
		a = sc.nextDouble();
		
		System.out.println("Digite o 2 numero que deseja multiplicar ");
		b = sc.nextDouble();
		cont = 0;
		while(i<=b) {
			
			 cont +=a  ;
			i++;
		}
	System.out.println(cont);*/
		
		
		/*
		// fibonacci
		
		int a =0, b=1, i=1, c;
		
		
		System.out.println("Quantos n�meros deseja usar na sequ�ncia de Fibonacci");
		c = sc.nextInt();

		while(i<c) {

			i = a+b;
			a=b;
			b=i;
			
			System.out.println(i);
			
			i++;
		}*/
		
		
		
		/*
		// exerc�cio 8
		
		int a , i=1;
		double y;
		
		System.out.println("Digite o tamanho da sequ�ncia: ");
		a = sc.nextInt();
		
		while(i<a) {
			
			y = (double)i/(i*i);
			
			System.out.println("Resposta: " + String.format("%.2f", y));
			
			i++;
		}*/
		
		
		/*
		// desconto por dependente
		
		String name, cpf;
		int dependente, pessoas, i=1;
		double salario, salarioNum, renda, montante, percent, salarioFinal;
		
		salario = 1000;
		
		System.out.println("Quantos impostos ser�o feitos");
		pessoas = sc.nextInt();
		
		while(i<=pessoas) {
			
			System.out.println("digite o Sobrenome do contribuinte: ");
			name = sc.next();
			
			System.out.println();
			
			System.out.println("Digite o CPF da pessoa:");
			cpf = sc.next();
			
			System.out.println("Digite o n�mero de dependentes: ");
			dependente = sc.nextInt();
			
			System.out.println("Digite quantos salarios minimos a pessoas recebe: ");
			salarioNum = sc.nextInt();
			
			montante = salario * salarioNum;
			
			//System.out.println("Montante: " +montante);
			
			percent = 0.05 * dependente;
			
			renda = percent * montante;
			
			salarioFinal = renda - montante;
			
			if(salarioFinal > 2*salario) {
				
			   System.out.println("isendo de pagamento");
				
			}else if(salarioFinal >= 3*salario) {
				
				System.out.println("pagar� 5%");
				
			}else if(salarioFinal > 4*salario) {
				
				System.out.println("pagar� 10%");
				
			}else if(salarioFinal >= 5*salario) {
				
				System.out.println("pagar� 15%");
				
			}else if(salarioFinal > 7*salario) {
				
				System.out.println("pagar� 20%");
			}
			
			
			i++;
		}
		*/
		
		
	}

}
