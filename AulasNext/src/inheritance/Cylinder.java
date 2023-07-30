package inheritance;

public class Cylinder extends Circle{
	
	private double height = 1.0;

	public Cylinder() {
		super();
		System.out.println("Constructed a Cylinder with Cylinder()");  // for debugging
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
		System.out.println("Constructed a Cylinder with Cylinder(height)");  // for debugging
	}

	public Cylinder(double height, double radious) {
		super(radious);
		this.height = height;
		System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  // for debugging
	}

	public Cylinder(double height, double radious, String color) {
		super(radious, color);
		this.height = height;
		System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  // for debugging
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Cylinder[radius=" + super.getRadius() + ",color=" + super.getColor() + ",height=" + height + "]";
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}
	
	@Override
	public double getArea() {
		return 2 * Math.PI * super.getRadius() * height;
	}

}
