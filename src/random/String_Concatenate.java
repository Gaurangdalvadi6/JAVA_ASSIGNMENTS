package java_assignments;

public class String_Concatenate {
public static void main(String[] args) {
	String str1 = "Tops ";
	String str2 = "Technologies";
	
	System.out.println("String 1 : " + str1);
	System.out.println("String 2 : " + str2);
	
	String str3 = str1.concat(str2);
	System.out.println("Concating String is : " + str3);
}
}
