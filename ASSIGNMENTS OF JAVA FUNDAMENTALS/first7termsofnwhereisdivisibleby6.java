import java.util.Scanner;
public class first7termsofnwhereisdivisibleby6 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.print(" ");
			int count = 0;
		for (int i=1; i<=7;i++) {
			int num = (i*6*i);
			if (num % 6 ==0){
				System.out.println(num);
				count++;
			}
		}
		}
	}

