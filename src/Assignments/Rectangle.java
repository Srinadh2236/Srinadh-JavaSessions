package Assignments;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {

		
		setLength(1.0);
		setWidth(2.0);

		System.out.println("len:" + length);
		System.out.println("wid:" + width);

	}

	public double getLength() {
		return length;
	}

	public double setLength(double length) {
		this.length = length;
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	
	public double calAre() {
		
		return length*width;
		
	}
	public static void main(String[] args) {

		Rectangle re = new Rectangle();
		re.setLength(2.0);
		re.setWidth(3.2);
		
		double area =re.calAre();

		System.out.println("Area: "+area);
	}

}
