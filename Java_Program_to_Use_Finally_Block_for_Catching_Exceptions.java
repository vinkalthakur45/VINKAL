package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;

public class Java_Program_to_Use_Finally_Block_for_Catching_Exceptions {
	 public static void main(String[] args)
	    {
	        try {
	            System.out.println("try block");
	            System.out.println(80 /2);
	        }
	        catch (ArithmeticException e) {
	            
	            System.out.println("Arithmetic Exception");
	            
	        }
	        finally {
	            
	            System.out.println(
	                "finally");
	            
	        }
	    }
}
