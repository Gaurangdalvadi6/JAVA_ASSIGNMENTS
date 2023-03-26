package random;

class Square {
	void Area(double side) {
		System.out.println("Area of Square : " + side * side);
	}

	void Area(float side) {
		System.out.println("Area of Square : " + side * side);
	}
}

class Rectangle {
	void Area(double l, double b) {
		System.out.println("Area of Rectangle : " + (l * b));
	}

	void Area(float l, float b) {
		System.out.println("Area of Rectangle : " + (l * b));
	}
}


public class AreaOfRectangleAndSquareBySameName {

	
	public static void main(String[] args) {
		Square obj = new Square();
		obj.Area(10);
		obj.Area(10.65);
		
		Rectangle obj2 = new Rectangle();
		obj2.Area(10, 15);
		obj2.Area(10.15, 15.50);
	}

}
