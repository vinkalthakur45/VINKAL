import java.util.Scanner;

public class make_an_array_with_user_inputs_of_size_10_then_take_multiplyng_factor_as_d_from_user_print_the_array_with_all_numbers_multiplied_by_multiplying_factor {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int [] arr = new int [10];
	        System.out.println("Enter the elements of array (type: int; size: 10;)");
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Enter a multiplying factor");
	        int mf = sc.nextInt();

	        System.out.println("The array elements before multiplied with multiplying factor:");
	        for(int element:arr){
	            System.out.print(element+" ");
	        }

	        System.out.println("\nThe array elements before multiplied with multiplying factor:");
	        for(int element:arr){
	            System.out.print(element*mf+" ");
	        }
	    }
}
