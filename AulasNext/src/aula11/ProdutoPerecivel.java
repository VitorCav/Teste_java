package aula11;

public class ProdutoPerecivel extends Produto{
	
	private int validade;

	public ProdutoPerecivel(int codigo, String nome, double preco) {
		super(codigo, nome, preco);
	}

	public ProdutoPerecivel(int codigo, String nome, double preco, int validade) {
		this(codigo, nome, preco);
		this.validade = validade;
	}
	
	

}
