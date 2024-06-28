public class StarPrinting10 {
    // write a java program to printing the following pattern
    //  |    *
    //  |   ***
    //  |  *****
    //  | *******
    //  |*********
    //  | *******
    //  |  *****
    //  |   ***
    //  |    *

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=n-1;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=i*2-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
