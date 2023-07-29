package exercicios;

public class Pessoa {
	int idade;
    int diaNasc;
    int mesNasc;
    int anoNasc;
    String nome;

    public Pessoa(int diaNasc, int mesNasc, int anoNasc, String nome) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.nome = nome;
    }

    void calcularIdade(int dia, int mes, int ano) {
        int difAno = ano - this.anoNasc;
        if(mes < this.mesNasc || dia < this.diaNasc){
            difAno--;
            this.idade = difAno;
        } else {
            this.idade = difAno;
        }
    }
    
    int informaIdade() {
        return this.idade;
    }

    String informaNome() {
        return this.nome;
    }

    void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNasc = dia;
        this.mesNasc = mes;
        this.anoNasc = ano;
    }
    void universidadeTrabalha () {
    	
    }
}