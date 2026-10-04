import java.util.Scanner;

public class InterMethod {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = sum(10,20);
        System.out.println("Ans is:" + sum);

        System.out.print("Enter your name:");
        String greet = greet(in.next());
        System.out.println(greet);


    }

    static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }


    static String greet(String name) {
        String massage = "Hi " + name + "!";
        return massage;
    }

}
