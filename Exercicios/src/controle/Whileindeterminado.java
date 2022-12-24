package controle;

import java.util.Scanner;

public class Whileindeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(! valor.equalsIgnoreCase("Sair")) {
			System.out.print("Voce diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
	}
}
