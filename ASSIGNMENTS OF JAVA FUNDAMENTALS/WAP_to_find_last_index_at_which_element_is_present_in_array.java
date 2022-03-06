import java.util.*;

public class WAP_to_find_last_index_at_which_element_is_present_in_array {
	public static int findIndex(int arr[], int t) {
		if (arr == null) {
			return -1;
		}
		int len = arr.length;
		int i = 0;

		while (i < len) {

			if (arr[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] my_array = { 3, 4, 5, 1, 6, 2, 7, 8, 9 };

		System.out.println("last_index_at_which_element_is_present_in_array: " + findIndex(my_array,9));

	}
}
