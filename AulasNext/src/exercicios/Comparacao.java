package exercicios;

public class Comparacao {

	public static void main(String[] args) {
		// Iniciar variaveis de teste
		int x = 3;
		int y = 2;
		int z = 1;
		// Iniciar a maior variavel
		int maior = x;
		//Comparar a maior variavel
		if (maior < y) {
			maior = y;
		}
		else if (maior < z) {
			maior = z;
		}
		
		System.out.println(maior);

	}

}
