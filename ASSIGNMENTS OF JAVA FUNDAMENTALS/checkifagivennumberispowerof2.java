import java.util.Scanner;
public class checkifagivennumberispowerof2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	 System.out.print(" ");
	 while(n%2==0)
	 {
		 n=n/2;
	 }
	 if(n==1) {
		 System.out.println("true");
	 }
	 else {
		 System.out.println("false");
	 }
}
}
