package composition;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y +")";
	}
	
	public int[] getXY() {
		int[] arrayTest = {this.x, this.y};				
		return arrayTest;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public double distance(int x, int y) {
		return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
	}
	
	public double distance(Point another) {
		return (Math.sqrt(Math.pow(this.x - another.getX(), 2) + Math.pow(this.y - another.getY(), 2)));
	}
	
	public double distance() {
		return (Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)));
	}
}
