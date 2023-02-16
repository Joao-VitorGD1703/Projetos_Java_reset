import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b, c;
		
		System.out.println("Digite as medidas e veja que tipo de triangulo se forma");
		
		System.out.print("Digite o primeiro valo -->");
		a= sc.nextInt();
		System.out.print("Digite o segundo valo -->");
		b= sc.nextInt();
		System.out.print("Digite o terceiro valo -->");
		c= sc.nextInt();
		
		if(a + b > c && a + c > b && b+c > a) {
			triangulo(a, b, c);
		}else {
			System.out.println("Digite valores que sejam válidos para formar um triangulo");
			
		}

	}
	
	public static void triangulo(int a, int b, int c) {
		if(a == b && b==c) {
			System.out.println("equilátero");
		}else if(a != b && b!=c && c!=a) {
			System.out.println("Escaleno");
		}else {
			System.out.println(" Isósceles");
		}
	}

}
