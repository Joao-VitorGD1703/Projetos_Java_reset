import java.util.Scanner;

public class testeAtividadeCPV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, resp, resp2;
		int guardar = 0;
		
		int[] arr = new int[4];

		
		
		System.out.print("Digite um número e veja seu resultado em decimal: ");
		numero = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			
			resp = numero % 2;
			
			resp2 = numero / 2;
			
			arr[i]= resp;
			 
			numero = resp2;
		}
		
		for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
		}
		
		
		
		
		
		
		
		

		sc.close();
	}

}
