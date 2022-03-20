package ASSIGNMENTS_FOR_JAVAFUNDAMENTALS_14MARCHTO18MARCH;

//Modify_the_class_to_add_a_is_Tails_method_that_returns_true_when_the_value_is_not_heads
/*
 public class Coin
{

   // constant to represent heads
   private static int HEADS = 1;

   // current value of the coin
   private int value = 0;

   // method to randomly set the value of the coin to heads or tails
   public void flip()
   {
      if (Math.random() < 0.5)
      {
          value = 0;
      }
      else
      {
         value = 1;
      }
   }

   // return true if the value is heads or false otherwise
   public boolean isHeads()
   {
      return value == HEADS;
   }

   // convert the value to a string
   public String toString()
   {
      if (value == HEADS) return "Heads";
      else return "Tails";
   }

   // test the class
   public static void main(String[] args)
   {

      Coin myCoin = new Coin();
      for (int i = 0; i < 10; i++)
      {
         myCoin.flip();
         System.out.println(myCoin);
         System.out.println(myCoin.isHeads());
      }
   }
} 
  */
//After modify the above code.......................
	public class Coin
	{

	   // constant to represent heads
	   private static int Tails = 1;

	   // current value of the coin
	   private int value = 0;

	   // method to randomly set the value of the coin to heads or tails
	   public void flip()
	   {
	      if (Math.random() < 0.5)
	      {
	          value = 0;
	      }
	      else
	      {
	         value = 1;
	      }
	   }

	   // return true if the value is heads or false otherwise
	   public boolean isTails()
	   {
	      return value == Tails;
	   }

	   // convert the value to a string
	   public String toString()
	   {
	      if (value == Tails) return "Tails";
	      else return "Heads";
	   }

	   // test the class
	   public static void main(String[] args)
	   {

	      Coin myCoin = new Coin();
	      for (int i = 0; i < 10; i++)
	      {
	         myCoin.flip();
	         System.out.println(myCoin);
	         System.out.println(myCoin.isTails());
	      }
	   }
	}
