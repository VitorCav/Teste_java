package exercicios;

import java.util.Scanner;

public class Fatorialfor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		
		int n = in.nextInt();
		int resultado = 1;
		
		//System.out.println(fatorial);
		
		for (int i = 1; i < n+1; i++) {
			resultado = resultado*i;
			//System.out.println("conta = " + resultado);
		}
		
		System.out.println(resultado);
		
		in.close();

	}

}
