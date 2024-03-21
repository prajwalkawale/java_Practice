public class PracticeQuestion05 {

    public static void main(String[]arg){
        // float a = 13/4 * 17/2;

        float a = 13/4.0f * 17/2.0f;
        System.out.println(a);

        // Write a java program to encrypt a grade by adding to it 8 . Decrypt it to show the correct grade

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting my grade

        grade = (char)(grade - 8);
        System.out.println("This is my Decrypted grade "+grade);
    }
}
