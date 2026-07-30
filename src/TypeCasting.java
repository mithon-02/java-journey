import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        //Typecasting in Java is the process of converting a value from one data type to another. It is commonly used when you need to assign a value of one type to a variable of a different type.

        Scanner input = new Scanner(System.in);

        float pi = 3;
        System.out.println(pi);

        int num = (int)(637.473f);
        System.out.println(num);

        // Automatic type promotion in expressions.

        int a = 257;
        byte b = (byte)(a);

        System.out.println(b);

        int c = 34874;
        byte d = (byte)(a);

        System.out.println(b);




    }
}
