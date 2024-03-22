import java.util.Locale;

public class StringMethods {

    public static void main(String[]arg){
        String srt = "Hello World"; // Strings are immutable it can not change
        System.out.println(srt);
        // String Length
        int checkLength = srt.length();
        System.out.println(checkLength);

        // toUppercase
        String toUpperCase1 = srt.toUpperCase();
        System.out.println(toUpperCase1);

        // toLowercase

        String lowerCase = srt.toLowerCase();
        System.out.println(lowerCase);

        // Trim
        String trimHelloWorld ="                   hello world";
        System.out.println(trimHelloWorld.trim());

        // Sub-string
        String subString = srt.substring(2); // it will cut the string from the index number
        System.out.println(subString);

        String subString2 = srt.substring(0,6); // the last index would be excluded
        System.out.println(subString2);

        String replaceOld = srt.replace('e','a');// it will replace old string
    }
}
