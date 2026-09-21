import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fruit = in.next();


        switch (fruit) {

            case "Apple":
                System.out.println("Sweet.");
                break;
            case "Mango":
                System.out.println("Very sweet.");
                break;
            case "Orange":
                System.out.println("Sour");
                break;

            default:
                System.out.println("Enter valid fruit!");





        }

        String day = in.next();

        switch (day) {

            case "Sunday" -> System.out.println("Working day.");
            case "Monday" -> System.out.println("Working day");
            case "Tuesday" -> System.out.println("Working day");
            case "Wednesday" -> System.out.println("Working day");
            case "Thursday" -> System.out.println("Working day");
            case "Friday" -> System.out.println("Weekday");
            case "Saturday" -> System.out.println("Weekday");
            default -> System.out.println("Enter valid date!");

        }




    }
}
