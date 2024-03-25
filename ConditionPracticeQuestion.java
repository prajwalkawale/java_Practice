import java.util.Scanner;
public class ConditionPracticeQuestion {
   /* Write a program to find out whether a Student is pass or fail ; if it requires total 40% and at least 33% in each
   subject to pass Assume three subjects and take marks as a input from the user
    */
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of physics: ");
        byte m1 = sc.nextByte();
        System.out.println("Enter your marks of Chemistry: ");
        byte m2 = sc.nextByte();
        System.out.println("Enter your marks of Mathematics: ");
        byte m3 = sc.nextByte();
        float avg =(m1+m2+m3)/3.0f;
        if(avg>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("Congratulations, You have been promoted!");
        }else {
            System.out.println("Sorry,You have been fail ! try next time.");
        }

        /*
        Calculate income tax paid by an employees to the government as per the salary mention below
        Income                 tax
        2.5L to 5.0             5%
        5.0L to 10.0L           20%
        Above 10L               10%
        Note that there is no tax below 2.5L Take input amount as an input from the user
         */

        System.out.println("Enter your salary: ");
        Scanner sl = new Scanner(System.in);
        float tax =0;
        float income = sl.nextFloat();
        if(income<2.5f){
            tax = tax+0.0f;
        }else if(income>2.5f&&income<=5.0f){
            tax = tax+0.05f*(income-2.5f);
        }else if(income>5.0f&&income<=10.0f){
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax +0.2f*(income-5.0f);
        }else if(income>10.0f){
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax +0.2f*(10.0f-5.0f);
            tax = tax +0.3f*(income-10.0f);
        }
        System.out.println("you will have to pay: "+tax);
    }
}
