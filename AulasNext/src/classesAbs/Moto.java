package classesAbs;

public class Moto extends Veiculo{
	
	private int cilindradas;

	public Moto() {
		
	}	

	public Moto(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria, int cilindradas) {
		super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
		this.cilindradas = cilindradas;		
	}

	@Override
	public void abastecer(int combustivel) {
		// TODO Auto-generated method stub
		super.abastecer(combustivel);
	}

	@Override
	public boolean viajar(int distancia) {
		
		int autonomia = getCombustivelNoTanque() * 30; 
		
		if (distancia < autonomia) {
			setCombustivelNoTanque(getCombustivelNoTanque() - (int)(distancia/30));
			setQuilometragem(getQuilometragem() + distancia);			 
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Veiculo veiculo) {
		// TODO Auto-generated method stub
		return super.equals(veiculo);
	}

	@Override
	public String getPlaca() {
		// TODO Auto-generated method stub
		return super.getPlaca();
	}

	@Override
	public int getCombustivelNoTanque() {
		// TODO Auto-generated method stub
		return super.getCombustivelNoTanque();
	}

	@Override
	public int getQuilometragem() {
		// TODO Auto-generated method stub
		return super.getQuilometragem();
	}

	@Override
	public boolean isAlugado() {
		// TODO Auto-generated method stub
		return super.isAlugado();
	}

	@Override
	public double getPrecoDiaria() {
		// TODO Auto-generated method stub
		return super.getPrecoDiaria();
	}

	@Override
	public void setPlaca(String placa) {
		// TODO Auto-generated method stub
		super.setPlaca(placa);
	}

	@Override
	public void setCombustivelNoTanque(int combustivelNoTanque) {
		// TODO Auto-generated method stub
		super.setCombustivelNoTanque(combustivelNoTanque);
	}

	@Override
	public void setQuilometragem(int quilometragem) {
		// TODO Auto-generated method stub
		super.setQuilometragem(quilometragem);
	}

	@Override
	public void setAlugado(boolean alugado) {
		// TODO Auto-generated method stub
		super.setAlugado(alugado);
	}

	@Override
	public void setPrecoDiaria(double precoDiaria) {
		// TODO Auto-generated method stub
		super.setPrecoDiaria(precoDiaria);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
	
	

}
