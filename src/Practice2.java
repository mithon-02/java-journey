import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {

        //Temperature Converter.

        Scanner input = new Scanner(System.in);
        int check;
        System.out.println("Convert C to F Enter-1");
        System.out.println("Convert F to C Enter-2");

        check = input.nextInt();

        if(check == 1) {
            System.out.println("Enter the C value:");
            float value = input.nextFloat();

            float result = (value * 9/5) + 32 ;

            System.out.println(value+"C = "+result+"F");

        } else if (check == 2) {
            System.out.println("Enter the F value:");
            float value = input.nextFloat();

            float result = (value - 32) * 5/9;

            System.out.println(value+"F = "+result+"C");


        }

        else System.out.println("Invalid Input..");


    }
}
