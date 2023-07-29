package classesAbs;

public class Retangulo extends Quadrilatero{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Retangulo() {
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (base + altura);
	}	

}
