package exercicios;

import java.util.Scanner;

public class Fatorialwhile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		int resultado = 1;
		
		System.out.println("Digite um numero inteiro: ");
		int n = in.nextInt();
		
		while (i < (n + 1)){
			resultado = resultado * i;
			System.out.println(resultado);
			i++;
		}
		
		in.close();

	}

}
