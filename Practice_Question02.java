import java.util.Scanner;
public class Practice_Question02 {

    public static void main(String[]arg){
        //Write a program to calculate CGPA using marks of three subject marks out of 100

        System.out.println("Enter your marks here !");
        Scanner srt = new Scanner(System.in);
        System.out.println("Enter your First Subject marks: ");
        float S1 = srt.nextFloat();
        System.out.println("Enter your Second Subject marks: ");
        float S2 = srt.nextFloat();
        System.out.println("Enter your Third Subject marks: ");
        float S3 = srt.nextFloat();
        float Total= S1+S2+S3;
        float CGPA = Total/30;
        System.out.println("You are secure with this CGPA : "+CGPA);
    }
}
