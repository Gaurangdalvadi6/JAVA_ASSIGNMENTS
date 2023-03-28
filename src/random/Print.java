package java_assignments;

public class Print {
	void Printn(int a,char c) {
		System.out.println("Interger is : " + a + " \t Char is : " + c);
	}
	
	void Printn(char c,int a) {
		System.out.println("Char is : " + c + "\t Integer is : " + a);
	}
	
public static void main(String[] args) {

	
	
	Print obj = new Print();
	obj.Printn(10, 'G');
	obj.Printn('P', 5);
	
}
}
