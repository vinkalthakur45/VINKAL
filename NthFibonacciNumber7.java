import java.util.Scanner;
public class NthFibonacciNumber7 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    int n = s.nextInt();
	    int num1 = 1;
	    int num2 = 1;
	    int fibonacci;
	 
	    for (int i=1; i<n; i++) {
	        fibonacci = num1 + num2;
	        num1 = num2;
	        num2 = fibonacci;
	    }
	    System.out.print(num1);
	}
	}
	
