package exercicios;

import java.util.Scanner;

public class Ex3Array {
	Scanner entrada = new Scanner(System.in);
	// Atributos
	
	int[] vetor;
	int nAtual;
	int nMax;
	
	// Cosntructor
	
	public Ex3Array(int numero) {
		int[] vetorTemp =new int[numero];		
		this.vetor = vetorTemp;
		this.nAtual = 0;
		this.nMax = vetorTemp.length;
	}
	
	// Metodos

	public Boolean adicionar (int n) {
		if (nAtual < nMax) {
			this.vetor[nAtual] = n;
			nAtual++;
		}
		else {
			return false;
		}
		
		return true;	
	}	
	
	public int calculaMedia() {
		int soma = 0;
		
		for (int i = 0; i < nAtual; i++) {
			soma = this.vetor[i] + soma;
		}
		
		int media = soma / nMax;
		
		return media;
	}

}
