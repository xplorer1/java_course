package chapter8;

import java.util.Scanner;

public class PasswordStrength {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.next();

        System.out.println("Password check status: " + processPassword(password));
    }

    public static String processPassword(String password) {
        String oldPassword = "ghdwwiwe333";
        String username = "john12fiasco";

        if(password.length() < 8) {
            return "Password must have at least 8 characters!";
        }

        if(!containsUpperCase(password)) {
            return "Password must contain at least an uppercase character!";
        }

        if(password.equals(oldPassword)) {
            return "Password must not be the same as old password!";
        }

        if(password.contains(username)) {
            return "Password must not contain username!";
        }

        if(!password.matches("[a-zA-Z0-9 ]*")) {
            return "Password must contain at least one special character!";
        }

        return "Password is correct!";
    }

    public static boolean containsUpperCase(String string) {
        var modifiedText = new StringBuilder(string);

        for (int i=0; i<modifiedText.length(); i++) {
            if(Character.isUpperCase(modifiedText.charAt(i))) {
                return true;
            }
        }

        return false;
    }
}
