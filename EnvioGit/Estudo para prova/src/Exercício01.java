import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, t, m;
		String nome;
		int rm;

		System.out.println("Vamos calcular a m�dia de suas notas para saber se foi aprovado ou n�o???");
		System.out.println("Suas notas s�o cmpostas por 3 provas e 1 trabalho.");
		
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
			System.out.println("Aluno:" + nome + " RM: " + rm + " Sua m�dia � de: " + m);
			System.out.println();
			System.out.println("Par�bens suas notas atingiram a m�dia.\r Voc� estara concorrendo a um MBA gratuito \r por conta de suas notas serem as maiores do curso ;) ");
			
		}else if(m >= 6) {
			System.out.println("Aluno:" + nome + " RM: " + rm + " Sua m�dia � de: " + m);
			System.out.println();
			System.out.println("Suas notas  atingingiram a m�dia ");
			
		}else {
			System.out.println("Aluno:" + nome + " RM: " + rm + "Sua m�dia � de: " + m);
			System.out.println();
			System.out.println("Sua nota n�o atingiu a m�dia");
		}
		
		
	}

}
