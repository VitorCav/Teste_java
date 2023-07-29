package aula15;

public class Retangulo extends Quadrilatero{
	
	private double lado, altura;
	
	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getAltura() * getLado();
	}
	
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (getAltura() + getLado());
	}

	public double getLado() {
		return lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
