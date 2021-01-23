package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePercent = 0.15;
        double baseCharge = 0.25;

        System.out.println("Enter base cost of the plan:");
        double basePlan = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int totalMinutes = scanner.nextInt();

        scanner.close();

        double average = averageCost(totalMinutes, baseCharge);

        double subTotal = average + basePlan;

        double tax = totalTax(subTotal, basePercent);

        double grandTotal = grandTotal(tax, subTotal);

        //calculate the tax, to calculate the overage fees, and to calculate and print the final total

        printReceipt(basePlan, average, tax, grandTotal);
    }

    public static double averageCost(int totalMinutes, double baseCharge) {
        return totalMinutes * baseCharge;
    }

    public static double totalTax (double subTotal, double basePercent) {
        return (subTotal * basePercent);
    }

    public static double grandTotal(double tax, double subTotal) {
        return tax + subTotal;
    }

    public static void printReceipt(double basePlan, double averageCost, double totalTax, double grandTotal ){

        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: N" + String.format("%.2f", basePlan));
        System.out.println("Average: N" + String.format("%.2f", averageCost));
        System.out.println("Tax: N" + String.format("%.2f", totalTax));
        System.out.println("Total: N" + String.format("%.2f", grandTotal));
    }
}
