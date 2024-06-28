public class StarPrinting09 {
    // write a java program to printing the following pattern
    //   |*********|
    //   | ******* |
    //   |  *****  |
    //   |   ***   |
    //   |    *    |

    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int space=n;space>i;space--){
                System.out.print(" ");
            }
            for(int j=i*2-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
