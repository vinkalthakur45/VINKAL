import java.util.*;

public class PrintInverted_V_Star_Pattern {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		int n = sc.nextInt();
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j > a; j--)
				System.out.print(" ");
			System.out.print("*");
			for (int j = 1; j < (a * 2); j++)
				System.out.print(" ");
			if (i < n - 1)
				System.out.print("*");
			a++;
			System.out.println();
		}

	}
}
