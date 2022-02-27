import java.util.*;

public class Print_the_Pants_Style_Star_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--)
				// Inner loop that prints first half stars
				System.out.print("* ");
			for (int a = 1; a <= 4 * i; a++)
				// Inner loop that prints space in between
				System.out.print(" ");
			for (int j = i + 1; j <= n; j++)
				// Inner loop that prints second half stars
				System.out.print("* ");
			// Prints a new line
			System.out.println();
		}
	}

}