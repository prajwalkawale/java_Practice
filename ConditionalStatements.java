import java.util.Scanner;
public class ConditionalStatements {

    public static void main(String[]arg){
        System.out.println("Enter a day number!");
        Scanner sc = new Scanner(System.in);
        int day;
        day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Today is a Monday");
            case 2 -> System.out.println("Today is a Tuesday");
            case 3 -> System.out.println("Today is a Wednesday");
            case 4 -> System.out.println("Today is a Thursday");
            case 5 -> System.out.println("Today is a Friday");
            case 6 -> System.out.println("Today is a Saturday");
            case 7 -> System.out.println("Today is a Sunday");
            default -> System.out.println("Sorry you have entered wrong input!");
        }
    }
}
