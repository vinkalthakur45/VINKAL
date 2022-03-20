package ASSIGNMENTS_FOR_JAVAFUNDAMENTALS_14MARCHTO18MARCH;

//Write_a_method_that_overloads_the_talk_method_by_taking_in_a_name_and_printing_Hello_with_that_name
	public class Test1
	{
	    public static void talk()
	    {
	          System.out.println("hello there!");
	    }
	    public static void talk(String name)
	    {
	          System.out.println("Hello " + name);
	    }
	     // FINISH THE METHOD HERE //
	    public static void main(String[] args)
	    {
	          talk("Matthew");
	    }
	}

