package fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
	
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double SuperiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - SuperiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
	}
}
