package userLoginReader;
import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
        // =========================
        // CREATE ACCOUNT
        // =========================

        System.out.println("===== CREATE ACCOUNT =====");

        System.out.print("Create a username: ");
        String correctUsername = input.nextLine();

        System.out.print("Create a password: ");
        String correctPassword = input.nextLine();

        System.out.println();
        System.out.println("Account created successfully!");
        System.out.println();

        // =========================
        // LOGIN
        // =========================

        int attempts = 3;

        while (attempts > 0) {

            System.out.println("===== LOGIN =====");

            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            // Check username and password
            if (username.equals(correctUsername) &&
                password.equals(correctPassword)) {

                System.out.println();
                System.out.println("Login Successful!");
                System.out.println("Welcome, " + username + "!");
                break;

            } else {

                attempts--;

                if (attempts > 0) {

                    System.out.println();
                    System.out.println("Incorrect username or password.");
                    System.out.println("Attempts remaining: " + attempts);
                    System.out.println();

                } else {

                    System.out.println();
                    System.out.println("Incorrect username or password.");
                    System.out.println("Account locked.");
                }
            }
        }

        input.close();
    }
}
