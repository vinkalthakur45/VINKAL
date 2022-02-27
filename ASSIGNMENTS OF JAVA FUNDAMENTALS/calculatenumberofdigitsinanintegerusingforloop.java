import java.util.*;

public class calculatenumberofdigitsinanintegerusingforloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int calculate = 0;
		while (num != 0) {
			num /= 10;
			++calculate;
		}
		System.out.println("Calculate number of digits = " + calculate);
	}
}
