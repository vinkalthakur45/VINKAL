import java.util.*;
public class Calculate_sum_of_number_till_n_wherenistakenfromuser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a=1,sum=0;
		while (a<=num) {
	    sum+=a;
	    a++;	
		}
		System.out.println("Sum of n numbers = "+sum);
	}
}

