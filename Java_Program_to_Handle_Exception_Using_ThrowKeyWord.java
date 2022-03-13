package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

public class Java_Program_to_Handle_Exception_Using_ThrowKeyWord {
	static void fun() {
		try {
			throw new NullPointerException(" vinkal");
		} catch (NullPointerException e) {
			System.out.println("this is fun().");
			throw e;
		}
	}

	public static void main(String args[]) {
		try {
			fun();
		} catch (NullPointerException e) {
			System.out.println("this is name.");
		}
	}
}
