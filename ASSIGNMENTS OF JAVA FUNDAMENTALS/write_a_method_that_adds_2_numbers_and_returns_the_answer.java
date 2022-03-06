import java.util.Scanner;

public class write_a_method_that_adds_2_numbers_and_returns_the_answer {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The sum of two number is: " + add(x, y));

	}
}
