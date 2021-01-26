package chapter8;

public class PrintBackwards {
    public static void main(String [] args) {
        String word = "camel";

        reverseString(word);
    }

    public static void reverseString (String string) {

        int stringLength = string.length() - 1;

        for(int i=stringLength; i>=0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
