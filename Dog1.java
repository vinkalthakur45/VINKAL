package ASSIGNMENTS_FOR_JAVAFUNDAMENTALS_14MARCHTO18MARCH;

// Add_an_equals_method_to_this_class_that_returns_true_if_the_current_Dog_and_passed_Dog_have_the_same_name_The_code_should_print_false_twice_then_true_twice
	public class Dog1{
		private String name;

		public Dog1(String name) {
			this.name = name;
		}

		public boolean equals(Object other) {
			Dog1 d1 = (Dog1) other;
			return this.name.equals(d1.name);

			// ADD CODE HERE
		}

		public static void main(String[] args) {
			Dog1 d1 = new Dog1("Rufus");
			Dog1 d2 = new Dog1("Sally");
			Dog1 d3 = new Dog1("Rufus");
			Dog1 d4 = d3;
			System.out.println(d1.equals(d2));
			System.out.println(d2.equals(d3));
			System.out.println(d1.equals(d3));
			System.out.println(d3.equals(d4));
		}
	}
