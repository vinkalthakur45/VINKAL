package ASSIGNMENTS_FOR_JAVAFUNDAMENTALS_14MARCHTO18MARCH;

//Edit_this_code_so_the_class_Beagle_is_a_subclass_of_the_Dog_class_When_you_run_the_code_it_should_print_woof_and_then_arf_arf
	public class Dog {
		public void speak() {
			System.out.println("woof!");
		}

		public static void main(String[] args) {
			Dog d = new Dog();
			d.speak();
			Beagle b = new Beagle();
			b.speak();
		}
	}

	class Beagle {
		public void speak() {
			System.out.println("arf arf");
		}
	}
