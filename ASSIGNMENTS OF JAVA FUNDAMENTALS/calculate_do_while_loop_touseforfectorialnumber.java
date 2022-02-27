import java.util.*;

public class calculate_do_while_loop_touseforfectorialnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int calculate = 1;
		int a = 1;
		do {
			a = a * calculate;
			calculate++;
		} while (calculate <= num);
		System.out.println("fectorial of " + num + "is:" + a);
	}

}
