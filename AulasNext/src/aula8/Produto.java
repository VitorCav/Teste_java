package aula8;

public class Produto {
	private String descricao;
	private double valor;
	private int estoque;
	
	public Produto(String descricao, double valor, int estoque) {
		this.descricao = descricao;
		this.valor = valor;
		this.estoque = estoque;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @return the estoque
	 */
	public double getEstoque() {
		return estoque;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}	

}
