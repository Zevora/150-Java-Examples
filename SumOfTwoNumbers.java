import java.util.Scanner;
public class SumOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Sum of TWO Numbers:");
        System.out.print("Please Enter the first number: ");
        int num1 = input1.nextInt();
        System.out.print("Please Enter the second number: ");
        int num2 = input1.nextInt();
        int total = num1 + num2;
        System.out.println("Total: " + total);
    }
}
