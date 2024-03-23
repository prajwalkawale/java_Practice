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


        // Replace String
        System.out.println(srt.replace('l','p'));// it would replace only one character
        System.out.println(srt.replace("Hello","Happy"));// this method would replace whole string

        // booleans
        String srt1 ="Programming";
        System.out.println(srt1.startsWith("Pro")); // the character starts with Pro character or not (True or False)
        System.out.println(srt1.endsWith("ing"));// it would check ,is this string ends with ing character

        System.out.println(srt1.charAt(3));

        System.out.println(srt1.indexOf("m")); // first m index occurrence

        String srt2 ="hellollollo";
        System.out.println(srt2.indexOf("llo",4));// second parameter for starts with 4 index and exclude the former
    }
}
