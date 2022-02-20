import java.util.Scanner;

public class Divisibileby3from1to100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("");
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				System.out.println(i);

			}
		}

	}

}
