public class WAP_to_find_first_index_at_which_element_is_present_in_array_ {
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
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

		System.out.println("first_index_at_which_element_is_present_in_array: " + findIndex(my_array, 5));

	}
}
