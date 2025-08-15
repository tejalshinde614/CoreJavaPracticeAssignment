package Package;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Correct credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        // User input
        System.out.println("Enter Your Username:");
        String inputUsername = sc.next();

        System.out.println("Enter Your Password:");
        String inputPassword = sc.next();

        // Logic to check login
        if (inputUsername.equals(correctUsername)) {
            if (inputPassword.equals(correctPassword)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Incorrect Password.");
            }
        } else {
            System.out.println("Incorrect Username.");
        }

        // Close scanner
        sc.close();
    }
}
