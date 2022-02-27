
public class Find_the_first_three_terms {
	public static void main(String[] args) {
	int count = 0;
	for (int i=1; i<=3;i++) {
		int num = (4*i+9);
		if (num % 4 !=0){
			System.out.println(num);
			count++;
		}
	}
	}
}