package exercicios;

import java.util.Scanner;

public class Ex3ArrayListControle {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas voce vai nos informar? ");
		int n = entrada.nextInt();		
		
		Ex3Array notas = new Ex3Array(n);
		
		for (int i=0 ; i < n;i++) {
			int posicao = i + 1;
			System.out.println("Digite a " + posicao + " nota");
			int notaIn = entrada.nextInt();
			notas.adicionar(notaIn);			
		}
		int media = notas.calculaMedia();
		
		System.out.println("Media = " + media);

	}

}
