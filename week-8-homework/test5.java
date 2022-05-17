public class test5 {
	String color;
	double area;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double calcArea(test5 object) {
		double area = 0;
		if(object instanceof Rectangle) {
			double a = ((Rectangle)object).getLength();
			double b = ((Rectangle)object).getWidth();
			area = a*b;
		} else if(object instanceof Triangle) {
			double a = ((Triangle)object).getBase();
			double b = ((Triangle)object).getHeight();
			area = (a*b)/2;
		}
		return area;
	}
	;
	public String toString() {
		return color + "," + area;
	}
}
class Rectangle extends test5 {
	private double length = 5;
	private double width = 5;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String toString() {
		return color + "," + area;
	}
}
class Triangle extends test5 {
	private double base = 5;
	private double height= 5;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String toString() {
		return color + "," + area;
	}
}
