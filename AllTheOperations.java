import java.util.Scanner;

public class AllTheOperations {
    public static void main(String[] args) {
        Scanner input3 = new Scanner(System.in);
        System.out.println("This will calculate for all of the operations.");
        System.out.print("Please enter the first number: ");
        int num1 = input3.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input3.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        double rem = num1 % num2;

        System.out.println("Sum = " + sum + "\n" + "Subtraction = " + sub + "\n" + "Multiplication = " + mult + "\n" + "Division = " + div  + "\n" + "Remainder = " + rem);
    }
}
