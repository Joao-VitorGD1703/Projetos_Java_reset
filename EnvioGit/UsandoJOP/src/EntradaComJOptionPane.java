import javax.swing.JOptionPane;

public class EntradaComJOptionPane {

	public static void main(String[] args) {
		String aux;
		float largura, comprimento, area, perimetro;
		try {
			aux =JOptionPane.showInputDialog("Entre com o comprimento");
			comprimento = Float.parseFloat(aux);
			
			aux =JOptionPane.showInputDialog("Entre com o largura");
			largura = Float.parseFloat(aux);
			
			area = comprimento * largura;
			perimetro = comprimento * 2 + largura *2;
			JOptionPane.showMessageDialog(null, "Area: " + area + " , Perimetro: " + perimetro);
					
		}catch(NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "hOUVE UM ERRO DE CONVERS�O, DIGITE APENAR NUMEROS");
			
			
		}

	}

}
