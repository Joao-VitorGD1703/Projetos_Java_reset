import java.util.Scanner;

public class TentativaSemClasses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Numero_aluno;
		
		System.out.println("Digite o n�mero de alunos: ");
		int alunos = sc.nextInt();

		int[] rms = new int[alunos]; 
		double[] nota1 = new double[alunos]; 
		double[] nota2 = new double[alunos]; 
		double[] media = new double[alunos]; 
		
		for (int i = 0; i < alunos; i++) {
			System.out.println("Digite os RMs dos alunos");
			rms[i] = sc.nextInt();
			
			System.out.println("Digite a primeira nota: ");
			nota1[i]= sc.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			nota2[i]= sc.nextDouble();
			
			media[i] = (nota1[i] + nota2[i]) /2;
				
		}
		
		for(int j =0; j< alunos; j++) {
			System.out.print("O Aluno do RM: ");
			System.out.print(rms[j]);
			
			System.out.print("M�dia: ");
			System.out.print(media[j]  );
			
			System.out.println();
		}
		
		
		
		
		
		
		 
		 
		
		
		
		

	}

}
