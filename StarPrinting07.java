public class StarPrinting07 {
    // Write a java program to printing the following pattern
    //    ****
    //   ****
    //  ****
    // ****

    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int space=n;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
