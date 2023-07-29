package exercicios;

public class Fatorial {

	public static void main(String[] args) {
		System.out.println("Programa para calcular fatorial!");
		
		int n = 1;
		int fim = 10;
		int resultado = 1;
		
		while (n <= fim) {
			
			for (int i = 1; i < n + 1; i++) {
				resultado *= i; 
			}
			
			System.out.println("O fatorial de " + n + " = " + resultado);
			n++;
			resultado = 1;
		}

	}

}
