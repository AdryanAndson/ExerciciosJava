package fundamentos;

public class ConversãoTiposPrimitivosNumericos {
 
	public static void main(String[] args) {
		
		double a = 1;//Implicita
		System.out.println(a);
		
		float b = (float) 1.1234567888;// explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Explicita (cast)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
