package random;

class Shape1 {
	public void print_shape() {
		System.out.println("This is shape");
	}
}

// Rectangle class is subclass of Shape class
class Rectangle1 extends Shape1 {
	public void print_rect() {
		System.out.println("This is rectangular shape");
	}
}

// Circle class is subclass of Shape class
class Circle extends Shape1 {
	public void print_circle() {
		System.out.println("This is circular shape");
	}
}

// Square class is subclass of Rectangle class
class Square1 extends Rectangle1 {
	public void print_square() {
		System.out.println("Square is a rectangle");
	}
}

public class Square_Is_A_Rectangle {
	public static void main(String[] args) {
		Square1 sq = new Square1(); // creating object of Square class
		sq.print_shape(); // Object of Square class calling function of Shape class
		sq.print_rect(); // Object of Square class calling function of Rectangle class
	}
}
