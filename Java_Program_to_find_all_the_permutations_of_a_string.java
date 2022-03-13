package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

import java.util.*;

public class Java_Program_to_find_all_the_permutations_of_a_string {
	public static String sp(String a, int b, int c) {
		char[] d = a.toCharArray();
		char ch;
		ch = d[b];
		d[b] = d[c];
		d[c] = ch;
		return String.valueOf(d);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String str = sc.next();
		int h = str.length();
		System.out.println("all_the_permutations_of_a_string_are: ");
		gp(str, 0, h);
	}

	public static void gp(String str, int start, int end) {
		if (start == end - 1)
			System.out.println(str);
		else {
			for (int i = start; i < end; i++) {
				str = sp(str, start, i);
				gp(str, start + 1, end);
				str = sp(str, start, i);
			}
		}
	}
}
