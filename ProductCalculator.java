import java.util.Scanner;
public class ProductCalculator
{
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nThis will calculate the product of two numbers.");
        System.out.print("Please enter the first number: ");
        int num1 = input2.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input2.nextInt();
        int total = num1 * num2;
        System.out.println("Total: " + total);
    }
}
