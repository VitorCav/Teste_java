package w3Exercicios;

public class Rectangle {
	
	double width;
	double heigth;
	
	public Rectangle(double width, double heigth) {
		
		this.width = width;
		this.heigth = heigth;
	}
	
	public double getArea() {
		return this.width * this.heigth;
	}
	
	public double getPerimiter() {
		return (2 * this.width) + (2 * this.heigth);
	}
	
	

}
