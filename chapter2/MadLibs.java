package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]) {
        //Get season of the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("What season of the year is it? ");
        String season = scanner.next();

        //Get adjective.
        System.out.println("Describe the day with one word: ");
        String adjective = scanner.next();

        //Get number of cups of coffer
        System.out.println("Give me a whole number: ");
        int number = scanner.nextInt();

        scanner.close();

        //display results
        System.out.println("On a " + adjective + " " + season + " of the year, I drank a minimum of " + number + " cups of coffer!");
    }
}
