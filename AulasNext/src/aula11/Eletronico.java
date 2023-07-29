package aula11;

public class Eletronico {
	
	private int codigo;
	private String nome;
		
	public Eletronico(String nome) {
		this.nome = nome;
	}

	public Eletronico(int codigo, String nome) {
		this(nome);
		this.codigo = codigo;		
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
