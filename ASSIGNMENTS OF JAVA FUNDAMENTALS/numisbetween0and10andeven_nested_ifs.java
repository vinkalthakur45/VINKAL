import java.util.*;
public class numisbetween0and10andeven_nested_ifs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc. nextInt();
		//int num=4;
		if(num>0)
			if(num<10)
				if(num%2==0) {
					System.out.println( "num is between 0 and 10 and even nestedif's ");
				}
				else {
					System.out.println("not num is between 0 and 10 and even nestedif's");
				}
		}
}
