import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        //Calculator.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("\nResult: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("\nResult: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("\nResult: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\nResult: " + result);
                } else {
                    System.out.println("\nError: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("\nInvalid operator!");
        }

        input.close();
    }
}