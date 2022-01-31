import java.util.*;
public class PerfectSquareNumberOrNot {
	   public static void main(String args[])
	   { 
	     
	   Scanner s = new Scanner(System.in);
	    int Num = s.nextInt();
	    
	    boolean isSquare = false; 
	    
	    for(int i = 0; i <= Num; i++) {
	      if(i*i == Num) {
	        System.out.print("yes");
	        isSquare = true;
	      }
	    }
	    
	    if(isSquare == false) {
	      System.out.print("Not");
	    }
	  }
}