import java.util.Scanner;
public class PracticeQuestion03 {
    // Write a Java program to convert kilometers to miles

    public static void main(String[]arg){
        System.out.println("This Program for convert kilometers to miles !");
        Scanner str = new Scanner(System.in);

        System.out.println("Enter kilometers for convert it into miles : ");
        float kilometer = str.nextFloat();
        float miles = kilometer*0.621371f;
        System.out.println("The miles are : "+miles);
    }
}
