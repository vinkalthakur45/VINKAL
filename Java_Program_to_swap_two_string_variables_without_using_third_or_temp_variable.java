package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;
import java.util.*;
public class Java_Program_to_swap_two_string_variables_without_using_third_or_temp_variable {         
	    public static void main(String[] args) { 
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("");
	        String a = sc.next(), b =sc.next();    
	         System.out.println(  a + " " + b);       
	        a = a + b;    
	        b = a.substring(0, (a.length() - b.length()));       
	        a = a.substring(b.length());    
	            
	        System.out.println( a+ " " + b);    
	    }    
	
	
}
