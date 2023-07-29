package Aula7;

public class CalculaIdade {

	public static void main(String[] args) {
		System.out.println("Vamos testar: ");
		//System.out.println("Albert Einstein");
		Pessoa pessoa = new Pessoa(14, 3, 1879, "Albert Einstein");
		System.out.println(pessoa.nome);
		pessoa.calculaIdade();
		System.out.println(pessoa.idade + " anos de idade!");
	}

}
