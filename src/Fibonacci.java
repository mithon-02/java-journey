import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = in.nextInt();
        int pre = 0;
        int next = 1;

        for(int i = 1; i <=n; i++) {

            int temp = pre + next;
            pre = next;
            next = temp;

        }

        System.out.println(pre);

    }
}
