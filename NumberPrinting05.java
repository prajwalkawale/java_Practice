public class NumberPrinting05 {
    // write a java program to printing the following pattern
    // 1
    // 23
    // 456
    // 78910
    // 11121314

    public static void main(String[] args) {
        int n=4,number=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.print("\n");
        }
    }
}
