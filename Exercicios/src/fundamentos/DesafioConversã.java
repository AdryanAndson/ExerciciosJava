package fundamentos;

import java.util.Scanner;

public class DesafioConversã {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salï¿½rio:");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o segundo salï¿½rio:");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o terceiro salï¿½rio:");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A mï¿½dia dos salï¿½rios ï¿½ " + media);
		
		entrada.close();
	}
}