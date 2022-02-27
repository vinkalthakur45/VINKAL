import java.util.Scanner;
public class agivennumberisdivisibleby2and8butnotby12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(" ");
//int n=24;
		for (int i = 1; i <= n; i++) {
			if (n % 2 == 0) {
				if (n % 8 == 0) {
					{
						if (n % 12 != 0) {

							System.out.println("yes");
							break;
						} else {
							System.out.println("not");
							break;

						}

					}
				}
			}
		}
	}
}
