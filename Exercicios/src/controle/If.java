package controle;

import java.util.Locale;
import java.util.Scanner;
public class If {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		System.out.println("Informe a m�dia: ");
		double media = input.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
		System.out.println("Aprovado!");
		System.out.println("Parabens!");
		}
		
		if(media <= 7 && media >= 4.5) {
		System.out.println("Recupera��o");
		}
		boolean criterioReprova = media < 4.5 && media >= 0;
		if(criterioReprova) {
			System.out.println("Reprovado");
		}
		
		
		input.close();
	}
}
