import java.util.Scanner;
public class IT24100822Lab6Q1
{
   public static void main(String[] args)
   {

      Scanner input=new Scanner(System.in);
      double number,square,square_root;
      
      System.out.println("Enter number");
      number=input.nextDouble();
    
      square=(number*number);
      square_root=(Math.sqrt(number));
      
      System.out.println("The square of"+square);
      System.out.println("The square_root of" +square_root);
    }
}