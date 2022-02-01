import java.util.Scanner;
public class Sum_Of_Number_Till_N {
	  public static void main(String args[]){
	      int sum = 0;
	      System.out.print("");
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();

	      for (int i = 1; i<=num;++i){
	         sum +=i;
	      }
	      System.out.println(+sum);
	   }
	}

