package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;
import java.io.*;
public class Java_Program_to_Handle_Exception_Using_Throws_KeyWord {
	  public static void findFile() throws IOException {
	    throw new IOException("File not found");
	  }

	  public static void main(String[] args) {
	    try {
	      findFile();
	      System.out.println(" this code in try block");
	    } catch (IOException e) {
	      System.out.println(e.getMessage());
	    }
}
}
