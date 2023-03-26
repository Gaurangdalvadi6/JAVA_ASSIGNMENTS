package random;

import java.util.Scanner;

public class ASCII_Value_given_Number {
	public static void main(String[] args) {
		System.out.println("enter any thing : ");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		int b = a;

		System.out.println("ASCII Value of given number is : " + b);
	}
}
