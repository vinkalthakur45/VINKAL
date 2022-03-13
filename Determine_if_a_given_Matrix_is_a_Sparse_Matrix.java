package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;
import java.util.*;
public class Determine_if_a_given_Matrix_is_a_Sparse_Matrix {
	public static void main(String args[])
    {
 	int i, j, zero = 0, count = 0; 
 	int array[][] = new int[10][10];
 	System.out.println("Enter rows and columns: ");
 	Scanner s = new Scanner(System.in);
 	int row = s.nextInt();
 	int column = s.nextInt();
 	System.out.println("Enter matrix:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
    	    {
                 array[i][j] = s.nextInt();
                 System.out.print(" ");
    	     }
        }
        for(i = 0; i < row; i++)
        {
 	    for(j = 0; j < column; j++) 
  	    {
                if(array[i][j] == 0)
    		{
        	    zero++; 
    		}
    	   	else
            	{
      	            count++;
    	    	}
   	   }
       }
       if(zero>count)
       {
           System.out.println("sparse matrix");
       }
       else
       {
           System.out.println("not a sparse matrix");
       }
    }
}