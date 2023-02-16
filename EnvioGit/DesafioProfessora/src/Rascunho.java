import java.util.Iterator;
import java.util.Scanner;

public class Rascunho {

	public static void main(String[] args) {
	
		    Scanner scan = new Scanner(System.in);

		    System.out.print("Insira o número de alunos: ");
		    int numAlunos = scan.nextInt();

		    int[] nums = new int[numAlunos];
		    double[] notas1 = new double[numAlunos];
		    double[] notas2 = new double[numAlunos];
		    double[] medias = new double[numAlunos];

		    for (int i = 0; i < numAlunos; i++) {
		      System.out.print("Insira o RM do aluno: ");
		      nums[i] = scan.nextInt();

		      System.out.print("Insira a primeira nota do aluno: ");
		      notas1[i] = scan.nextDouble();

		      System.out.print("Insira a segunda nota do aluno: ");
		      notas2[i] = scan.nextDouble();

		      medias[i] = (notas1[i] + notas2[i]) / 2;
		    }

		    System.out.println("Números dos alunos:");
		    for (int i = 0; i < numAlunos; i++) {
		      System.out.print(nums[i] + " ");
		    }
		    System.out.println();

		    System.out.println("Médias:");
		    for (int i = 0; i < numAlunos; i++) {
		      System.out.print(medias[i] + " ");
		    }
		    System.out.println();
		  }
		

		
		
	
	
	
		
		
	

}
