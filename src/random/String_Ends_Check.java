package java_assignments;

public class String_Ends_Check {
public static void main(String[] args) {
	String str1 = "Java Exercises";
	String str2 = "Java Exercise";
	
	String a = "se";
	boolean ends1 = str1.endsWith(a);
	boolean ends2 = str2.endsWith(a);
	
	System.out.println(str1 + " ends with " + " '" + a +"' ? " + ends1);
	System.out.println(str2 + " ends with " + " '" + a +"' ? " + ends2);
}
}
