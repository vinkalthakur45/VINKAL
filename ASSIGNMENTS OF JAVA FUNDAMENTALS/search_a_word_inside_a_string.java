public class search_a_word_inside_a_string {
		public static void main(String[] args) {
			String strOrig = "MY NAME IS VINKAL";
			int intIndex = strOrig.indexOf("VINKAL");
			if(intIndex == - 1) {
				System.out.println("not found");
			} else {
				System.out.println("Found VINKAL ");
			}
		}
	}
