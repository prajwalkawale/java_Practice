public class LoopPracticeQuestion02 {

    public static void main(String[]arg){
        // Write a program to find out factorial of n number using for loop

        int n = 5;
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial =factorial*i;
        }
        System.out.println(factorial);
        System.out.println("\n");
        // factorial : - using while loop

        int i = 1;
        int factorial2 =1;
        while(n>=i){
            factorial2 = factorial2 *i;
            i++;
        }
        System.out.println(factorial2);

        // Problem No: 6
        int j =1;
        int a = 5;
        while(j<=a){
            int k =1;
           while(k<=j){
               System.out.print("*");
               k++;
           }
            System.out.print("\n");

            j++;
        }

        // Problem number 7
        //Write a program to calculate the sum of the

    }
}
