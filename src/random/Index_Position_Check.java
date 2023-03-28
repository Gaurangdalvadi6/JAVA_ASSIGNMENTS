package java_assignments;

public class Index_Position_Check {
	public static void main(String[] args) {
		String name = "Tops Technologies!";
		System.out.println("Original String : " + name);

		int index1 = name.charAt(0);
		int index2 = name.charAt(10);

		System.out.println("character at position 0 is : " + (char) index1);
		System.out.println("character at position 10 is : " + (char) index2);
	}
}
