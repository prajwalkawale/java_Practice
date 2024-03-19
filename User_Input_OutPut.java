
import java.util.Scanner;

public class User_Input_OutPut {

    public static void main(String[] arg) {
       System.out.println("This program will Add two numbers: ");
       Scanner str = new Scanner(System.in);
        System.out.println("Add the value of a :");
        int a = str.nextInt();
        System.out.println("Enter the value of b :");
        int b = str.nextInt();
        System.out.println("The sum of the two value are : ");
        int sum = a + b;
        System.out.println(sum);

        //Boolean value check
        System.out.println("Enter a value to check if this number an int number or not");
        Boolean B1 = str.hasNextInt();
        System.out.println(B1);
        System.out.println("Print user input statements: ");
        String StringValue = str.next();
        System.out.println(StringValue);
    }
}
