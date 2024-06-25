public class StarPrinting06 {
    // write a java program to print the following pattern
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int space=0;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
