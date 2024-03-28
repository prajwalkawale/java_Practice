public class LoopPracticeQuestions {

    public static void main(String[]arg){
        /*
        Write a java program to print following pattern
        ****
        ***
        **
        *
         */
        int n =4;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        // Problem No.2
        // Write a program to print sum first n even numbers using while loop

        int a = 4;
        int sum =0;
        for(int i=0;i<a;i++) {
            sum = sum + (2 * i);
        }
        System.out.println("The sum of first even number n is: "+sum);
        System.out.println("\n");
        // Problem No. 3
        // Write a program to print multiplication table of given  number n

        int b =5;
        for(int i=0;i<=10;i++){
          //  System.out.println(i*b);
            System.out.printf("%d X %d = %d",i,b,i*b); // with using printf
            System.out.println("\n");
        }
        System.out.println("\n");

        // Write a program to print multiplication table of 10 in reverse order
        int c = 10;
        for(int i=c;i>=0;i--){
            System.out.printf("%d X %d = %d",c,i,c*i);
            System.out.println("\n");
        }

     }
}
