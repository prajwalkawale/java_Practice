import java.util.Scanner;
public class PracticeQuestion06 {

    public static void main(String[]arg){
        // Use a comparison operator to determine whether the number is entered by the user is greater than 8 or not

        System.out.println("Enter a number :");
        Scanner user = new Scanner(System.in);
        int a = user.nextInt();
        System.out.println(a>8);
    }
}
