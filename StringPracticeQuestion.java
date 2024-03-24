public class StringPracticeQuestion {

    public static void main(String[]arg){
        // Write a java program to convert a string to lowercase

        String srt ="HELLO WORLD";
        System.out.println(srt.toLowerCase());

        // Write a java program to replace space with underscore
        System.out.println(srt.replace("HELLO WORLD","hello_world"));
        System.out.println(srt.replace(' ','_')); // another method

        // Write a java program to fill in a letter template which looks like bellow

        String letter ="Dear <name> Thanks a lot!";
        letter = letter.replace("<name>","Harry");
        System.out.println(letter);

        // Write a java program to detect double and triple spaces in a string

        String detectSpaces ="Hello i am  learning  java   language";
        System.out.println(detectSpaces.indexOf("  "));
        System.out.println(detectSpaces.indexOf("   "));

        // write a java program to format the following letter using escape sequence character

        String escapeSequence ="Today's weather is quite good!";
        escapeSequence ="\"Today's weather is quite good\"";

        String letter2 ="Dear Clay,We are pleased to extend to you the offer to join our firm as a web designer.Thank you";
        letter2 = "Dear Clay\n \t We are pleased to extend to you the offer to join our firm as a web designer\nThank you!";
        System.out.println(escapeSequence);
        System.out.println(letter2);
    }
}
