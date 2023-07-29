package classesAbs;

public abstract class Veiculo {
	
	private String placa;
	private int combustivelNoTanque;
	private int quilometragem;
	private boolean alugado;
	private double precoDiaria;
	
	public Veiculo() {
		
	}
		
	public Veiculo(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria) {		
		this.placa = placa;
		this.combustivelNoTanque = combustivelNoTanque;
		this.quilometragem = quilometragem;
		this.alugado = alugado;
		this.precoDiaria = precoDiaria;
	}

	public void abastecer(int combustivel) {
		this.combustivelNoTanque += combustivel;
	}
	
	public abstract boolean viajar(int distancia);
	
	public String toString() {
		return "";
	}
	
	public boolean equals (Veiculo veiculo) {
		if (this.placa == veiculo.placa) {			
			return true;
		}
		return false;
	}

	public String getPlaca() {
		return placa;
	}

	public int getCombustivelNoTanque() {
		return combustivelNoTanque;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setCombustivelNoTanque(int combustivelNoTanque) {
		this.combustivelNoTanque = combustivelNoTanque;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	
	

}
