
import java.util.Scanner;
public class PracticeQuestion {

    public static void main(String[]arg){
// Write a program to calculate a percentage of given students
        System.out.println("Enter your marks !");
        Scanner srt = new Scanner(System.in);
        System.out.println("Enter your first subject marks: ");
        float FirstSub = srt.nextFloat();
        System.out.println("Enter your second subject marks: ");
        float SecondSub = srt.nextFloat();
        System.out.println("Enter your third subject marks: ");
        float ThirdSub = srt.nextFloat();
        System.out.println("Enter your fourth subject marks: ");
        float FourthSub = srt.nextFloat();
        System.out.println("Enter your fifth subject marks: ");
        float Fifthsub = srt.nextFloat();
        float Calculation1 =FirstSub+SecondSub+ThirdSub+FourthSub+Fifthsub;
        float FinalCalculation1 = Calculation1*100/500f;
        System.out.println("Your percentage is :"+FinalCalculation1+"%");
        System.out.println("End your program");
    }
}