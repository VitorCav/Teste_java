package aula8;

public class Lampada {
	private boolean estado;
	private int watts;
	
	public Lampada(boolean estado) {
		this.estado = estado;		
	}

	public Lampada(int watts, boolean estado) {
		this.estado = estado;
		this.watts = watts;
	}

	public Lampada() {
		this.estado = false;
		this.watts = 60;
	}

	public boolean getEstado() {
		return estado;
	}

	public int getWatts() {
		return watts;
	}

//	public void setEstado(boolean estado) {
//		this.estado = estado;
//	}
//
//	public void setWatts(int watts) {
//		this.watts = watts;
//	}
	
	

}
