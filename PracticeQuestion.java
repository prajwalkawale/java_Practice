
import java.util.Scanner;
public class PracticeQuestion {

    public static void main(String[]arg){
// Write a program to calculate a percentage of given students
        System.out.println("Enter total marks of a subject (i.e : 100 or 80)!");
        Scanner srt = new Scanner(System.in);
        float max = srt.nextFloat();
        System.out.println("Enter your first subject marks: ");
        float firstSub = srt.nextFloat();
        System.out.println("Enter your second subject marks: ");
        float secondSub = srt.nextFloat();
        System.out.println("Enter your third subject marks: ");
        float thirdSub = srt.nextFloat();
        System.out.println("Enter your fourth subject marks: ");
        float fourthSub = srt.nextFloat();
        System.out.println("Enter your fifth subject marks: ");
        float fifth_sub = srt.nextFloat();
        float calculation1 =firstSub+secondSub+thirdSub+fourthSub+fifth_sub;
        float finalCalculation1 = calculation1*100/(max*5);
        System.out.println("Your percentage is :"+finalCalculation1+"%");
        System.out.println("End your program");
    }
}
