import java.util.Scanner;
public class CharactersInputsAndPrints {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.print("");
    char i= s.next().charAt(0);
        //char i = '5';

        if(i >= 'A' && i <= 'Z')
            System.out.println("1");
            else if(i>='a' && i<='z')
            {
              System.out.println("0");
            }
        else
        System.out.println("-1");
            
    }


}
