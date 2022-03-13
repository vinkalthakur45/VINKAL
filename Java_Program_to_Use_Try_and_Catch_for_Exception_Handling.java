package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

public class Java_Program_to_Use_Try_and_Catch_for_Exception_Handling {
		public static void main (String[] args)
		{
			int[] arr = new int[4];
			try
			{
				int i = arr[4];
				System.out.println("try block");
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Exception  Catch block");
			}
			System.out.println(" handling");

	}

}
