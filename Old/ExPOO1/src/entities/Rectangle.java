package util;

public class Rectangle {

	public double widht;
	public double height;
	
	public double area (double widht, double height) {
		return widht * height;
	}
	
	public double perimeter (double widht, double height) {
		return 2 * (widht + height);
	}
	
	public double diagonal (double widht, double height) {
		return Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2));
	}
}
