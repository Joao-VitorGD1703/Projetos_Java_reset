import javax.swing.JOptionPane;

public class Produtos {

	public static void main(String[] args) {
		String aux;
		double valor_do_desconto, valor_do_produto, desconto, ValorFinal ;
		
		try {
			aux = JOptionPane.showInputDialog("Digite o valor do produto");
			valor_do_produto = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite o valor do desconto");
			desconto = Float.parseFloat(aux);
			
			
			valor_do_desconto = valor_do_produto * (desconto / 100);
			ValorFinal  = valor_do_produto - valor_do_desconto;
			JOptionPane.showMessageDialog(null, "O valor do desconto � de : R$  " + String.format("%.2f", valor_do_desconto)  + ", portanto o valor final fica em: R$ " + String.format("%.2f", ValorFinal));
			
		}catch(NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "HOUVE UM ERRO DE CONVERS�O, DIGITE APENAR NUMEROS");
			
		}

	}

}
