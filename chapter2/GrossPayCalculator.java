package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static  void main(String arg[]) {
        //Get the number of hours worked.
        System.out.println("How many hours do you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly pay rate.
        System.out.println("What is your pay rate?");
        double rate = scanner.nextDouble();
        scanner.close();
        //Multiply hours and pay rate.

        double grosspay = hours * rate;
        //Display result.

        System.out.println("Your gross pay is $" + grosspay + ".");
    }
}
