package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Ex2Sorteio {

	public static void main(String[] args) {
		// Criar entrada
		Scanner entrada = new Scanner(System.in);
		// Gerar um numero aleatorio
		int nAleatorio = (int)(Math.random() * 1000);		
		// Entrada do usuario
		System.out.println("Digite um numero para verificar: ");
		int nUsuario = entrada.nextInt();
		
		while (nAleatorio != nUsuario) {
			if (nAleatorio > nUsuario) {
				System.out.println("O numero gerado é maior! tente de novo ");
				nUsuario = entrada.nextInt();
			}
			else {
				System.out.println("O numero gerado é menor! tente de novo ");
				nUsuario = entrada.nextInt();				
			}
		}
		
		System.out.println("Acertou miseravi");
		System.out.println("Numero sorteado = " + nAleatorio);
		

	}

}
