package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

import java.util.*;

public class Java_Program_to_print_smallest_and_biggest_possible_palindrome_word_in_a_given_string {

	public static boolean checkPalin(String word) {

		int n = word.length();

		word = word.toLowerCase();

		for (int i = 0; i < n; i++, n--) {
			if (word.charAt(i) != word.charAt(n - 1))
				return false;
		}

		return true;
	}

	public static void lengthPalindrome(int temp, String words[]) {

		int count = 0;
		String smallest = "", longest = "";

		for (int i = 0; i < temp; i++) {

			if (checkPalin(words[i])) {
				count++;
				if (count == 1)
					smallest = longest = words[i];
				else {
					if (smallest.length() > words[i].length())
						smallest = words[i];
					if (longest.length() < words[i].length())
						longest = words[i];
				}
			}
		}

		if (count == 0)

			System.out.println("No palindrome found");

		else {

			System.out.println("Smallest palindrome: " + smallest);
			System.out.println("Biggest palindrome: " + longest);
		}
	}

	public static void main(String[] args) {
		String b = "Nitin is a good student";
		String word = "";

		String[] words = new String[100];
		int temp = 0;

		b = b + " ";

		for (int i = 0; i < b.length(); i++) {

			if (b.charAt(i) != ' ') {
				word = word + b.charAt(i);
			}

			else {
				words[temp] = word;
				temp++;
				word = "";
			}
		}

		System.out.println(b);
		lengthPalindrome(temp, words);
	}
}
