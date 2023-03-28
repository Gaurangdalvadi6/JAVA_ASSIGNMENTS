package java_assignments;

class Triangle{
	int a,b,c;
	public double getArea() {
		double p = (a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public double getPerimeter() {
		return (a+b+c)/2.0;
	}
}
public class Triangle_Area_And_Perimeter {
public static void main(String[] args) {
	Triangle t = new Triangle();
	t.a = 3;
	t.b = 4;
	t.c = 5;
	
	System.out.println("Area of Triangle : " + t.getArea());
	System.out.println("Perimeter of Triangle : " + t.getPerimeter());
}
	
}
