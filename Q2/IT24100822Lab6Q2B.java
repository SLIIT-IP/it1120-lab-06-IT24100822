import java.util.Scanner;

public class IT24100822Lab6Q2B 
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        
        System.out.println("Please enter 10 numbers:");
                
        int count = 0;
        while (count < 10)
        {
            System.out.print("Enter number " +(count+1)+ ": ");
            numbers[count] = input.nextInt();
            count++;
        }
        System.out.println("The numbers you entered are:");
        for (int num : numbers) 
        {
        System.out.print(num+" ");
        }
   
    }
}
