package inheritance;

public class Circle {
	
	private double radius = 1.0;
	private String color = "Red";
	
	public Circle() {
		System.out.println("Construced a Circle with Circle()");  // for debugging
	}

	public Circle(double radius) {
		this.radius = radius;
		System.out.println("Construced a Circle with Circle(radius)");  // for debugging
	}

	public Circle(double radius, String color) {
		this(radius);
		this.color = color;
		System.out.println("Construced a Circle with Circle(radius, color)");  // for debugging
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	

}
