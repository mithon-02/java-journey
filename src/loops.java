import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        // for loop.
        /*
            Syntax:

            for(initialisation; condition; increment/decrement) {
            body

            }
         */

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 10; i++){
            System.out.println(i+"-I love you!");
        }

        for(int i = 1; i <= 10; i+=2) {
            System.out.println(i+"-I love you too!");
        }


        //while loop
        /*
            Syntax:
            initialization.
            while(condition) {
                body
                increment/ decrement
            }

         */

        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }

        //do while:
        /*
            initialization
            do{
                body
                increment/ decrement
               } while(condition)
         */

        int j = 1;
        do {
            System.out.println(j);
            j += 1;
        }while(j<=10);


        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println(max);

    }
}
