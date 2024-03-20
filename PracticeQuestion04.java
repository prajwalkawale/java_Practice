import java.util.Scanner;
public class PracticeQuestion04 {
    // Write a program to detect Whether a number entered the by user are integer or not
    public static void main(String[]arg){
       Scanner usr = new Scanner(System.in);
        System.out.println("Enter a number here!");
        System.out.println(usr.hasNextInt());



        // quick query
//        int a =5;
//        int b =a++;
//        System.out.println(b);

        int a = 5;
        int b = ++a;
        System.out.println(b);

        int c = 5;
        int d = c++ * 8;
        System.out.println(d);

    }
}
