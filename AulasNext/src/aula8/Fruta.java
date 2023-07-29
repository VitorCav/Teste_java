package aula8;

public class Fruta {
	private boolean casca;
	private boolean caroco;
	
	public Fruta(boolean casca, boolean caroco) {		
		this.casca = casca;
		this.caroco = caroco;
	}
	
	public void retirarCaroco() {
		if (caroco == true) {
			caroco = false;			
		}		
	}

	public boolean getCasca() {
		return casca;
	}

	public boolean getCaroco() {
		return caroco;
	}

	public void setCasca(boolean casca) {
		this.casca = casca;
	}

	public void setCaroco(boolean caroco) {
		this.caroco = caroco;
	}

}
