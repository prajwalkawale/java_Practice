import java.util.Scanner;
public class ConditionPracticeQuestion3 {
    // Write a java program to find weather a year entered by user is leap year or not
    public static void main(String[]arg){

        System.out.println("Enter a Year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%100==0&& year%400==0){
            System.out.println("This is a leap year!");
        }else if(year%100 !=0 && year%4==0){
            System.out.println("This is a leap year!");
        }else{
            System.out.println("This is a not leap year!");
        }
    }
}
