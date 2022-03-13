package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;
import java.util.*;
public class Java_Program_to_find_the_longest_repeating_sequence_in_a_string {
	public static String longest_repeating_sequence(String a, String b) {
		int n = Math.min(a.length(), b.length());
		for (int i = 0; i < n; i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return a.substring(0, i);
			}
		}
		return b.substring(0, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		System.out.println("");
		String c = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String x = longest_repeating_sequence(str.substring(i, n), str.substring(j, n));
				if (x.length() > c.length())
					c = x;
			}
		}
		System.out.println("Longest repeating sequence: " + c);
	}
}
