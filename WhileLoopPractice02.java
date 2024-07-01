class WhileLoopPractice02{
    // Write a program to calculate the sum of the number occurring in the multiplication table of 8

    public static void main(String[]arg){
        int n=8;
        int i=1;
        int sum=0;
        int table=1;
        while(i<=10){
            table=n*i;
            i++;
            sum=sum+table;
        }
        System.out.println("The table of 8 is: "+table);
        System.out.println("the sum of the table is: "+sum);
    }
}
