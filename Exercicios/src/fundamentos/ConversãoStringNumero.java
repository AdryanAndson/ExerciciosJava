package fundamentos;

import javax.swing.JOptionPane;

public class ConversãoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro nï¿½mero");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o Segundo nï¿½mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma ï¿½ " + soma);
		System.out.println("Media ï¿½ " + soma / 2);
	}
}
