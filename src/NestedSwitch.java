import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int studentId = in.nextInt();
        int department = in.nextInt();

        switch (studentId) {

            case 1:
                System.out.println("ID No:211");
                switch (department){
                    case 1 -> System.out.println("CSE");
                    case 2 -> System.out.println("EEE");
                    case 3 -> System.out.println("Civil");

                    default -> System.out.println("Non valid input!");
                }
                break;
            case 2:
                System.out.println("ID No:212");
                switch (department){
                    case 1 -> System.out.println("CSE");
                    case 2 -> System.out.println("EEE");
                    case 3 -> System.out.println("Civil");

                    default -> System.out.println("Non valid input!");
                }
                break;
            case 3:
                System.out.println("ID No:213");
                switch (department){
                    case 1 -> System.out.println("CSE");
                    case 2 -> System.out.println("EEE");
                    case 3 -> System.out.println("Civil");

                    default -> System.out.println("Non valid input!");
                }
                break;

            default:
                System.out.println("Non valid input!");

        }





    }
}
