import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, numero, resp;
		int i = 0;

		System.out.println("Digite o numero de triangulos que voc� deseja");
		numero = sc.nextInt();
		int[] trianguloEscaleno = new int[numero];
		int[] trianguloEquilatero = new int[numero];
		int[] trianguloisociles = new int[numero];

		int[] triangulo = new int[numero];
		for (i = 0; i < triangulo.length; i++) {

			resp = i;

			System.out.println("Digite as medidas dos triangulos: ");

			System.out.print("Lado 1: ");
			x = sc.nextInt();

			System.out.print("Lado 2: ");
			y = sc.nextInt();

			System.out.print("Lado 3: ");
			z = sc.nextInt();

			if (x > y + z || y > x + z || z > y + x) {
				do {
					System.out.println();
					System.out.println("Digite  medidas VALIDAS para se formar um tri�ngulo: ");

					System.out.print("Lado 1: ");
					x = sc.nextInt();

					System.out.print("Lado 2: ");
					y = sc.nextInt();

					System.out.print("Lado 3: ");
					z = sc.nextInt();

					System.out.println();

					if (x != y && x != z && y != z) {

						trianguloEscaleno[i] = resp + 1;
						System.out.println("Tri�ngulo escaleno: " + trianguloEscaleno[i]);
						System.out.println();

					} else if (x == y && y == z) {

						trianguloEquilatero[i] = resp + 1;
						System.out.println("Tri�ngulos equil�tero: " + trianguloEquilatero[i]);
						System.out.println();

					} else {

						trianguloisociles[i] = resp + 1;
						System.out.println("Tri�ngulo is�sceles: " + trianguloisociles[i]);
						System.out.println();

					}
					System.out.println();
				} while (x > y + z || y > x + z || z > y + x);

			} else {

				if (x != y && x != z && y != z) {

					trianguloEscaleno[i] = resp + 1;
					System.out.println("Tri�ngulo escaleno: " + trianguloEscaleno[i]);
					System.out.println();

				} else if (x == y && y == z) {

					trianguloEquilatero[i] = resp + 1;
					System.out.println("Tri�ngulos equil�tero: " + trianguloEquilatero[i]);
					System.out.println();

				} else {

					trianguloisociles[i] = resp + 1;
					System.out.println("Tri�ngulo is�sceles: " + trianguloisociles[i]);
					System.out.println();

				}
				System.out.println();

			}
		}
		System.out.println("O n�mero dos triangulos s�o referentes a ordem digitada");
		System.out.println();

		System.out.print("O(s)  ");
		for (int j = 0; j < trianguloEquilatero.length; j++) {
			if (trianguloEscaleno[j] != 0) {
				System.out.print(trianguloEscaleno[j] + "  ");
			}

		}
		System.out.print(" s�o triangulos Escaleno.");
		System.out.println();

		System.out.print("O(s)  ");
		for (int j = 0; j < trianguloEquilatero.length; j++) {
			if (trianguloEquilatero[j] != 0) {
				System.out.print(trianguloEquilatero[j] + "  ");
			}

		}
		System.out.print(" s�o triangulos equilatero.");

		System.out.println();

		System.out.print("O(s) ");
		for (int j = 0; j < trianguloisociles.length; j++) {
			if (trianguloisociles[j] != 0) {
				System.out.print(trianguloisociles[j] + "  ");
			}

		}
		System.out.print("  s�o triangulos Is�ciles.");

	}

}
