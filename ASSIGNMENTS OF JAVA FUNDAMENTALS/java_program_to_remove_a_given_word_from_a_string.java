import java.util.*;

public class java_program_to_remove_a_given_word_from_a_string {
	static void remove(String str, String word) {
		String msg[] = str.split(" ");
		String new_str = "";
		for (String words : msg) {
			if (!words.equals(word)) {
				new_str += words + " ";
			}
		}
		System.out.print(new_str);
	}

	public static void main(String[] args) {
		String str = "My name is vinkal";
		String word = "is";
		remove(str, word);
	}
}
