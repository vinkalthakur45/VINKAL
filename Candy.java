package ASSIGNMENTS_FOR_JAVAFUNDAMENTALS_14MARCHTO18MARCH;

//Override_the_taste_method_from_the_Candy_class_in_the_Chocolate_class_to_return_tastes_chocolately__it_should_print_tastes_sweet_and_then_tastes_chocolately
	public class Candy {
		public String taste()
	    {
	        return ("tastes sweet!");
	    }

		public static void main(String[] args)
	    {
	        Candy c1 = new Candy();
	        System.out.println(c1.taste());
	        Candy c2 = new Chocolate();
	        System.out.println(c2.taste());
	    }
	}

	class Chocolate extends Candy {
		public String taste() {
			return ("tastes chocolately");
		}
		// ADD CODE HERE
	}
