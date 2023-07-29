package aula10;

public class Funcionario {
	
	private String cpf;
	private String nome;
	private Dependente dependente;
	
	public Funcionario(String cpf, String nome, Dependente dependente) {
		this.cpf = cpf;
		this.nome = nome;
		this.dependente = dependente;
	}

	public Funcionario() {
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	
	
	
	

}
