package random;

import java.util.Scanner;

public class Student_Marks_Pass_Fail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Marks : ");
		int marks = sc.nextInt();

		if (marks >= 91 && marks <= 100) {
			System.out.println("The grade of a student is AA.");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("The grade of a student is AB.");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("The grade of a student is BB.");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("The grade of a student is BC.");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("The grade of a student is CD.");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("The grade of a student is DD.");
		} else {
			System.out.println("Fail");
		}
	}
}
