import java.util.Scanner;
public class IncomeTaxproblem {
    // Calculate income tax paid by an employee to the government as per the slab mentioned below
    // if 2.5l to 5l then 5%
    // if 5l to 10l then 20%
    // if above 10l then 30%
    public static void main(String[]arg){
        System.out.println("Enter your salary for calculate the total tax you will have to pay: ");
        double em;
        Scanner sc = new Scanner(System.in);
        em = sc.nextDouble();
        if(em<250000f){
            System.out.println("You don't have to pay tax!");
        }else if(em>250000f && em<500000){
           double tax = (em-250000)*0.05;
            System.out.println("You have to pay tax of about "+tax);
        }else if(em>500000f && em<1000000f){
            double tax1 =(250000*0.05)+(500000-em)*0.20;
            System.out.println("You have to pay tax of about "+tax1);
        }else{
            double tax2 =(250000*0.05)+(500000*0.20)+((1000000-em)*0.30);
            System.out.println("You have to pay tax of about "+tax2);
        }
    }
}
