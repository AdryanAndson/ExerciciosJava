package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
	
		double media = 8.6;
		String resultadoFinal = media >= 7.0? 
				"aprovado." :  "Em recuperação";
		
		System.out.println(" O Aluno está " + resultadoFinal);
	}
}
