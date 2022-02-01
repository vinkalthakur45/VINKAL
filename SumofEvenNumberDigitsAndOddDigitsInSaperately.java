import java.util.Scanner;
public class SumofEvenNumberDigitsAndOddDigitsInSaperately {
         public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.print("");
             int num1=0;
             int num2=0;
             for(int i=0;i<number;i--)
            {
            	 
                 if ((number % 10)%2 == 0)
                     num1 = num1 + number % 10;
                 else
                     num2 = num2 + number % 10;
                 number = number / 10;
             }
        System.out.print( num1);  
          System.out.print(" " +num2);
         } 
        	 
}