package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

public class Java_Program_to_Implement_the_Nested_Try_Statements {
	public static void main(String args[]) {
		try {
			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println(a[5]);
			try {
				int x = a[2] / 0;
			} catch (ArithmeticException e2) {
				System.out.println("division by zero is not possible");
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("index not exists");
		}
	}
}
