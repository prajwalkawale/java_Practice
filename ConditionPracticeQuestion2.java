import java.util.Scanner;
public class ConditionPracticeQuestion2 {

    public static void main(String[]arg){
        // Write a program to find out the type of website from the url entered by the user

        System.out.println("Enter URL: ");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("This is an commercial website! ");
        }else if(website.endsWith(".in")){
            System.out.println("This is an indian website! ");
        }else if(website.endsWith(".org")){
            System.out.println("This is an organizational website! ");
        }
    }
}
