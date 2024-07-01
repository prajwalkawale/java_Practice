import java.util.Scanner;
public class WhileLoopFactorial {
    // Write a while loop program to print the factorial of the given number

    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial");
        int n = sc.nextInt();
        int i=1;
        int facto=1;
        while(i<=n){
            facto=facto*i;
            i++;
        }
        System.out.println(facto);
    }
}
