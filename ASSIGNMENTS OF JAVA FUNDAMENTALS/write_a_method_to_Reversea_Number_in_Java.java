import java.util.Scanner;

public class write_a_method_to_Reversea_Number_in_Java {
	static int rev(int a) {
		int reverce = 0;
		int digit;
		while (a != 0) {
			digit = a % 10;
			reverce = reverce * 10 + digit;
			a = a / 10;
		}
		return reverce;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("The reverce of this number is: " + rev(num));
	}

}

