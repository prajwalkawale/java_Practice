import java.util.Scanner;
public class LeapYear {
    public static void main(String[]arg){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        year = sc.nextInt();
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("This is a leap year!!");
        }else if(year%100==0 && year%400!=0 || year%4!=0){
            System.out.println("This is not a leap year!!");
        }else{
            System.out.println("wrong year you have entered!!");
        }
    }
}
