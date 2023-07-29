package aula11;

public class Computador extends Eletronico {
	
	private double clockDaCpu;

	public Computador(int codigo, String nome) {
		super(codigo, nome);
	}

	public Computador(int codigo, String nome, double clockDaCpu) {
		this(codigo, nome);
		this.clockDaCpu = clockDaCpu;
	}

	public double getClockDaCpu() {
		return clockDaCpu;
	}

	public void setClockDaCpu(double clockDaCpu) {
		this.clockDaCpu = clockDaCpu;
	}
	
}
