public class StarPrinting02 {
    // write a program to print following star printing pattern
    // *
    // **
    // ***
    // ****

    public static void main(String[]arg){
        int n = 4;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
