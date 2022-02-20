import java.util.*;

public class Sum_Of_all_Digits_in_a_Number {

	static int Sum(int n) {
		int sum;
		for (sum = 0; n > 0; sum += n % 10, n /= 10)
			;

		return sum;
	}

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.print("");
			System.out.println(Sum(n));

		}
	}
}