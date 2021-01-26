package chapter7;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String [] args) {
        String [] daysoftheweek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day of the week (value must be between 1 and 7");
        int day = scanner.nextInt();

        scanner.close();

        if(day > 7 || day < 1) {
            System.out.println("Value must be between 1 and 7.");
        } else {
            System.out.println("Day of the week is: " + daysoftheweek[day - 1]);
        }
    }
}
