package controle;

public class Desafiofor {

	public static void main(String[] args) {
		String valor = "#";
		for(int i = 1; i<= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Vers�o do desafio
		//n�o pode usar valor numerico pra controlar o la�o!
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
