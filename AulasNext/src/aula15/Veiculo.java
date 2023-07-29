package aula15;

public abstract class Veiculo {
	
	private String placa;
	private int combustivelNoTanque;
	private int quilometragem;
	private boolean alugado;
	private double precoDiaria;
	
	public void abastecer(int combustivel) {
		
	}
	
	public abstract boolean viajar(int distancia);
	
	public String toString() {
		
		return "";
		
	}
	
	public boolean equals(Veiculo veiculo) {
		return true;
	}

}
