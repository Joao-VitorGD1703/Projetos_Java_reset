package estudoDemetodos;

import java.util.Scanner;

public class testeMetodoArray {

	public static void main(String[] args) {
		int[] x = new int[10];
		int total;
		total = somar(x);
		System.out.println("soma dos elementos = " + total);
	}

	public static int somar(int[] x) {
		int k, total;
		for (k = total = 1; k < x.length; k++)
			total += x[k];
		return total;
	}

}
