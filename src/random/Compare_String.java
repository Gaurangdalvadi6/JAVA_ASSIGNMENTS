package java_assignments;

public class Compare_String {
public static void main(String[] args) {
	String str1 = "topsint.com";
	String str2 = "Topsint.com";
	String str3 = "topsint.com";
	
	System.out.println("Comparing "+ str1 +" and " + str3 + " : "+ str1.equals(str3));
	System.out.println("Comparing "+ str2 +" and " + str3 + " : "+ str2.equals(str3));
}
}
