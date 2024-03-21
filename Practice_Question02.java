import java.util.Scanner;
public class Practice_Question02 {

    public static void main(String[]arg){
        //Write a program to calculate CGPA using marks of three subject marks out of 100

        System.out.println("Enter your marks here !");
        Scanner srt = new Scanner(System.in);
        System.out.println("Enter your First Subject marks: ");
        float s1 = srt.nextFloat();
        System.out.println("Enter your Second Subject marks: ");
        float s2 = srt.nextFloat();
        System.out.println("Enter your Third Subject marks: ");
        float s3 = srt.nextFloat();
        float total= s1+s2+s3;
        float cgpa = total/30;
        System.out.println("You are secure with this CGPA : "+cgpa);
    }
}
