package random;

class rectangle {
	int length, breadth;

	public rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	void print_Area() {
		System.out.println(length * breadth);
	}

	void print_perimeter() {
		System.out.println(2 * (length + breadth));
	}
}

class square extends rectangle {
	public square(int s) {
		super(s, s);
	}
}

public class AreaAndPerimeterOfrectangleAndsquare {
	public static void main(String[] args) {

		rectangle r = new rectangle(4, 5);
		square s = new square(4);
		r.print_Area();
		r.print_perimeter();
		s.print_Area();
		s.print_perimeter();
	}
}
