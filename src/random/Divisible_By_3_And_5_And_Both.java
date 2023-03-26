package random;

public class Divisible_By_3_And_5_And_Both {
public static void main(String[] args) {
	System.out.println("Divided by 3: ");
	for (int i = 1; i <= 100; i++) {
		if (i%3==0) {
			System.out.print(i + ", ");
		}
	}
	System.out.println();
	System.out.println("Divided by 5: ");
	for (int i = 1; i <= 100; i++) {
		if (i%5==0) {
			System.out.print(i + ", ");
		}
	}
	System.out.println();
	System.out.println("Divided by 3: & Divided by 5: ");
	for (int i = 1; i <= 100; i++) {
		if (i%3==0 && i%5==0) {
			System.out.print(i + ", ");
		}
	}
}
}
