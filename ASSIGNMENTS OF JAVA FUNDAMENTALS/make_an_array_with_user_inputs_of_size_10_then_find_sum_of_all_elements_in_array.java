import java.util.Scanner;

public class make_an_array_with_user_inputs_of_size_10_then_find_sum_of_all_elements_in_array {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.println("Enter the array elements (size: 10; type: integer;)");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The array elements are:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		int sum = 0;
		for (int a : arr) {
			sum = sum + a;
		}
		System.out.println("\nThe sum of all array elements are: " + sum);
	}

}
