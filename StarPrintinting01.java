public class StarPrintinting01 {
    // write a java program to print following pattern
    // ****
    // ***
    // **
    // *

    public static void main(String[]arg){
        int n = 4;

        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
