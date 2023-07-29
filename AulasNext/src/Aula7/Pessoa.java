package Aula7;

public class Pessoa {
	// Atributos
	int idade;
	int dia;
	int mes;
	int ano;
	String nome;
	
	// Constructor
	
	public Pessoa(int dia, int mes, int ano, String nome) {		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
		this.nome = nome;
	}
	
	// Métodos
	
	void calculaIdade() {
		int anoHoje = 2023 - this.ano;
		int mesHoje = 7 - this.mes;
		//int diaHoje = 15 - this.dia;
		
		if (mesHoje <= 0) {
			this.idade = anoHoje + 1;
		}
		else {
			this.idade = anoHoje;
		}
		
	}
	
	int informaIdade() {
		return this.idade;
	}
	
	String informaNome() {
		return this.nome;
	}	
	
	void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
	}
	
}
