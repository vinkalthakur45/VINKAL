import java.util.Scanner;

public class Write_Calculator_program_including_add_diff_multiply_divide_average_and_modulo_Include_menu_driven_logic_for_above_operations_and_ask_if_user_want_to_continue_using_do_while {
	static void check(char c, float a, float b) {
		if (c == '+') {
			System.out.println(add(a, b));
		} else if (c == '-') {
			System.out.println(dif(a, b));
		} else if (c == '*') {
			System.out.println(mul(a, b));
		} else if (c == '/') {
			System.out.println(div(a, b));
		} else if (c == '%') {
			System.out.println(mod(a, b));
		} else if (c == 'a') {
			System.out.println(ave(a, b));
		} else {
			System.out.println("Invelid input");
		}
	}

	static float add(float a, float b) {
		return a + b;
	}

	static float dif(float a, float b) {
		return a - b;
	}

	static float mul(float a, float b) {
		return a * b;
	}

	static float div(float a, float b) {
		return a / b;
	}

	static float mod(float a, float b) {
		return a % b;
	}

	static float ave(float a, float b) {
		return (a + b) / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***CALCULATOR***");
		boolean again = false;
		do {
			System.out.print("num1: ");
			float n1 = sc.nextFloat();
			System.out.print("num2: ");
			float n2 = sc.nextFloat();
			System.out.println("Operatio perform(+,-,*,/,% and a for average)");
			char c = sc.next().charAt(0);
			check(c, n1, n2);

			System.out.println("type n for calculate again");
			char n = sc.next().charAt(0);
			if (n == 'n') {
				again = true;
			} else {
				again = false;
			}

		} while (again);
		System.out.println("\n***Thank You***\n");
	}
}
