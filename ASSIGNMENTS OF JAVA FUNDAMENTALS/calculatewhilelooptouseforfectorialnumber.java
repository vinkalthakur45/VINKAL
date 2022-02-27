import java.util.*;
public class calculatewhilelooptouseforfectorialnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int calculate = 1;
		int a=1;
		while (calculate<=num) {
			a=a*calculate;
		calculate++;
		}
		System.out.println("fectorial of "+num + "is:"+a);
	}
}
