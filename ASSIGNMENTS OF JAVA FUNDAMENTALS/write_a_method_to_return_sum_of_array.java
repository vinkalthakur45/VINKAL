public class write_a_method_to_return_sum_of_array {
	public static void main(String args[]) {
		int a[] = {5,6,9,5};
		int b[] = {6,5,8,5,};
		int c[] = new int[b.length];
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i]+b[i];
		}
		for(int j = 0; j<c.length; j++) {
			
			System.out.print(" "+c[j]);
		}
	}
}
