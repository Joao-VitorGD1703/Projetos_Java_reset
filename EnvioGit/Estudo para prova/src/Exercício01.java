import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, t, m;
		String nome;
		int rm;

		System.out.println("Vamos calcular a média de suas notas para saber se foi aprovado ou não???");
		System.out.println("Suas notas são cmpostas por 3 provas e 1 trabalho.");
		
		System.out.println("Digite seu nome : ");
		nome = sc.next();
		System.out.println("Digite seu RM: ");
		rm = sc.nextInt();
		
		System.out.print("Digite a nota da sua primeira prova: ");
		n1 =sc.nextDouble();
		
		System.out.print("Digite a nota da sua segunda nota: ");
		n2 =sc.nextDouble();
		
		System.out.print("Digite a nota da sua terceira prova: ");
		n3 = sc.nextDouble();
		
		System.out.print("Digite a nota do seu trabalho");
		t = sc.nextDouble();
		
		m = (n1 + n2 + n3 + t)/4;
		
		if(m >= 9) {
			System.out.println("Aluno:" + nome + " RM: " + rm + " Sua média é de: " + m);
			System.out.println();
			System.out.println("Parábens suas notas atingiram a média.\r Você estara concorrendo a um MBA gratuito \r por conta de suas notas serem as maiores do curso ;) ");
			
		}else if(m >= 6) {
			System.out.println("Aluno:" + nome + " RM: " + rm + " Sua média é de: " + m);
			System.out.println();
			System.out.println("Suas notas  atingingiram a média ");
			
		}else {
			System.out.println("Aluno:" + nome + " RM: " + rm + "Sua média é de: " + m);
			System.out.println();
			System.out.println("Sua nota não atingiu a média");
		}
		
		
	}

}
