package ASSINMENTS_FOR_JAVAFUNDAMENTAL7_MARCH_2022;
import java.util.*;
public class Find_the_Frequency_of_Odd_and_Even_Numbers_in_the_given_Matrix {
	 public static void main(String[] args) 
	    {
	        int a, b, count1 = 0, count2 = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter rows");
	        a = s.nextInt();
	        System.out.print("Enter columns");
	        b = s.nextInt();
	        int c[][] = new int[a][b];
	        System.out.println("Enter matrix:");
	        for (int i = 0; i < a; i++) 
	        {
	            for (int j = 0; j < b; j++) 
	            {
	                c[i][j] = s.nextInt();
	            }
	        }
	        System.out.println("Matrix:");
	        for (int i = 0; i < a; i++) 
	        {
	            for (int j = 0; j < b; j++) 
	            {
	                System.out.print(c[i][j] + " ");
	            }
	            System.out.println("");
	        }
	        for (int i = 0; i < a; i++) 
	        {
	            for (int j = 0; j < b; j++) 
	            {
	                if((c[i][j] % 2) == 0)
	                {
	                    count1++;
	                }
	                else
	                {
	                    count2++;
	                }
	            }
	        }
	        System.out.println("Even frequency:"+count1);
	        System.out.println("Odd frequency:"+count2);
	    }
}
