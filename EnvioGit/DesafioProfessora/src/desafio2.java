import java.util.Iterator;
import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de alunos: ");
		int  numDeAlunos = sc.nextInt();

		double[] rm = new double[numDeAlunos];
		double[] nota1 = new double[numDeAlunos];
		double[] nota2 = new double[numDeAlunos];
		double[] media = new double[numDeAlunos];
		
	
		double numDeA = numDeAlunos;
			
			entradaDeDados(rm, nota1, nota2, numDeAlunos, media);
			Imprimir(rm, nota1, nota2, numDeAlunos, media);
			
					
		
		
		
		
			
			
			

		
		

		sc.close();
		
	}
	
	public static void entradaDeDados (double[] rm, double[] nota1, double[] nota2, int numDeAlunos, double[] media) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i =0; i<numDeAlunos; i++) {
			
			System.out.println("Digite o n�mero do RM do aluno: ");
			rm[i] = sc.nextDouble();
			
			System.out.println("Digite a primeira nota: ");
			nota1[i] = sc.nextDouble();
			
			System.out.println("Digite a segunda  nota: ");
			nota2[i] = sc.nextDouble();
			
			clacularMedia(nota1, nota2, media, numDeAlunos);
			
			
		}
		
		
		
		
		
		
	
	}
	
	public static void clacularMedia ( double[] nota1, double[] nota2,  double[] media, int numDeAlunos) {
		for(int i = 0; i>numDeAlunos; i++) {
			 media[i] = (nota1[i] + nota2[i])/2;
			
		}
		
		
		
		
		
	}
	
	public static void Imprimir (double[] rm, double[] nota1, double[] nota2,  int numDeAlunos, double[] media) {
		System.out.print("Os Alunos de segunte RM obtiveram as seguntes m�dias:"); 
		for(int j =0; j< numDeAlunos; j++) {
			
			System.out.print(rm[j] + " ");
		}
		System.out.println();
		
		System.out.print("m�dias:");
		for(int k =0; k< numDeAlunos; k++) {
		 
			System.out.print(media[k] + " ");
		}
		
		
		
		
	}
	
		
	


	
	
	

}
