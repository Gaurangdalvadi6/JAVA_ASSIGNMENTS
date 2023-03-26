package random;

class Pclass{
	public void pmethod() {
		System.out.println("This is parent class.");
	}
}

class Cclass extends Pclass{
	public void cmethod() {
		//super.pmethod();
		System.out.println("This is child class.");
	}
}
public class ParentClassChildClassMethod {
	public static void main(String[] args) {
		Pclass m = new Pclass();
		Cclass n = new Cclass();
		m.pmethod();
		n.cmethod();
		n.pmethod();
	}
}
