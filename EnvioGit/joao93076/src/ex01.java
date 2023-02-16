import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mercados;
		int produtos;

		System.out.print("Quantos mercados irão ser analizados: ");
		mercados = sc.nextInt();

		System.out.println();
		System.out.print("Quantos produtos farão parte da análize:");
		produtos = sc.nextInt();

		double[] numeroProdutos = new double[produtos];
		double[][] numeroMercados = new double[produtos][mercados];
		double precoTotal = 0;
		double precoQuantidadeTotal;

		for (int i = 0; i < numeroProdutos.length; i++) {
			System.out.println("Pronuto numero " + (i + 1));
			System.out.print("Quantidade deste produto: ");
			numeroProdutos[i] = sc.nextDouble();
			System.out.println();
		}
		for (int i = 0; i < mercados; i++) {
			System.out.println("MERCADO " + (i + 1) + '\n');
			precoTotal = 0;
			for (int j = 0; j < produtos; j++) {
				System.out.println();
				System.out.print("Preço por unidade em R$: ");
				numeroMercados[i][j] = sc.nextDouble();
				System.out.println();
				precoQuantidadeTotal = numeroMercados[i][j] * numeroProdutos[j];
				System.out.print("produto " + (j + 1) + " Preço referente a quantidade do produto em R$: "
						+ precoQuantidadeTotal);
				precoTotal = precoTotal + precoQuantidadeTotal;
				System.out.println();
			}
			System.out.println();
			System.out.println("PREÇO TOTAL A SE PAGAR : " + " R$ " + precoTotal + " NO MERCADO " + (i + 1));
			System.out.println("\n");
		}

	}

}
