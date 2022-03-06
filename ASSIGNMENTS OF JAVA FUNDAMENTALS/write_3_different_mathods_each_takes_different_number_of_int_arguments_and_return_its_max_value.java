public class write_3_different_mathods_each_takes_different_number_of_int_arguments_and_return_its_max_value {
	static int max(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}

	static int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	static int max(int a, int b, int c, int d) {
		if (a >= b && a >= c && a >= d) {
			return a;
		} else if (b >= a && b >= c && b >= d) {
			return b;
		} else if (c >= a && c >= b && c >= d) {
			return c;
		} else {
			return d;
		}
	}

	public static void main(String[] args) {
		System.out.println("maxiumu values is: ");
		System.out.println(max(4, 7));
		System.out.println(max(7, 8, 5));
		System.out.println(max(23, 56, 43, 34));
	}
}
