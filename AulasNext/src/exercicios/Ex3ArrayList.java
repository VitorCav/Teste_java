package exercicios;

import java.util.ArrayList;

public class Ex3ArrayList {	
	// Atributos
	
	ArrayList<Integer> vetor = new ArrayList<Integer>();
	int nAtual;
	int nMax;
	
	// Cosntructor
	
	public Ex3ArrayList(int numero) {
		ArrayList<Integer> vetorTemp =new ArrayList<Integer>(numero);		
		this.vetor = vetorTemp;
		this.nAtual = 0;
		this.nMax = vetorTemp.size();
	}
	
	// Metodos

	public Boolean adicionar (int n) {
		if (nAtual < nMax) {
			this.vetor.set(nAtual, n);
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
			soma = this.vetor.get(i) + soma;
		}
		
		int media = soma / nMax;
		
		return media;
	}

}
