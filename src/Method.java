import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        greeting();
        sum();
        int i = sum2();
        System.out.println("Sum is:" + i);

        String question = ask();
        System.out.println(question);

    }

    static void greeting() {
        System.out.println("Good morning!");
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter number 1:");
        num1 = in.nextInt();
        System.out.print("Enter number 2:");
        num2 = in.nextInt();
        System.out.println("Sum is:" + (num1 + num2));
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1:");
        num1 = in.nextInt();
        System.out.print("Enter number 2:");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }

    static String ask() {
        String question = "Do you understand the basic method?";

        return question;
    }

}
