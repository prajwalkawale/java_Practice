import java.util.Scanner;
public class Factorial {
    // Write a while loop to calculate the factorial of the number

    public static void main(String[]arg){
        int n;
        System.out.println("Enter a number to calculate the factorial of the number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of the number is :"+fact);
    }
}
