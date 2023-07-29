package exercicios;

import java.util.Scanner;

public class Ex1Primos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int n = entrada.nextInt();
		int cont = 1;
		
		for (int i = 2; i < n+1; i++) {
			
			if (n % i == 0) {
				cont++;
			}			
		}
		
		if (cont == 2) {
			System.out.println("O numero é primo! ");
		}
		else {
			System.out.println("Não é primo!");
		}

	}
	
	

}
