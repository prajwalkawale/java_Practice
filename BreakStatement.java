import java.security.spec.RSAOtherPrimeInfo;

public class BreakStatement {

    public static void main(String[]arg){

//        for(int i=0;i<10;i++){
//            System.out.println(i);
//            if(i==3){
//                System.out.println("End of the program!");
//                continue;
//            }
//            System.out.println("I am learning java!");
//        }
        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("I am learning java");
//            i++;
//            if(i==3){
//                System.out.println("End of the program!");
//                break;
//            }
//        }while(i<5);

        do {
            i++;
            System.out.println(i);
            if(i==3){
                System.out.println("End of the program!");
                continue;
            }
            System.out.println("I am learning java!");
        }while(i<5);
    }
}
