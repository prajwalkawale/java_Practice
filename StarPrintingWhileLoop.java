public class StarPrintingWhileLoop {
    // Write a java program to print th following star pattern using while loop
    //  |****|
    //  |*** |
    //  |**  |
    //  |*   |

    public static void main(String[]arg){
        int n=5;
        int i=1;
        while(i<=n){
            int j=n;
           while(j>=i){
                System.out.print("*");
                j--;
            }
            System.out.print("\n");
            i++;
        }

    }
}
