package recursivos;

public class Testar {

	public static void main(String[] args) {
		
		int n = 5;
		
		Calcular fat = new Calcular();
		
		System.out.println("Fatorial de " + n + " = " + fat.fatorial(n));
		
		System.out.println("Soma de 0 até "+ n + " = " + fat.somaAte(n));

	}

}
