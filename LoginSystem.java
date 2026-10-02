package userLoginReader;
import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// correct login info
		String correctUsername = "admin";
		String correctPassword = "12345";
		
		// # of attempts
		int attempts = 3;
		
		//Login Loop
		while (attempts > 0) {
			System.out.print("Enter username");
			String username = input.nextLine();
			
			System.out.print("Enter password");
			String password = input.nextLine();
			
			// Check username and password
			
			if (username.equals(correctUsername) &&
				password.equals(correctPassword)) {
					System.out.print("Login Successful");
					System.out.print("Welcome, " + username +"!");
					
					break;
				} else { 
					
					attempts--;
					
					if (attempts > 0) {
						System.out.println("Incorrct username or password");
						System.out.println("Attempts remaining: " + attempts);
						System.out.println(); 
					}  else {
						System.out.println("Incorrect username or password");
						System.out.println("Account locked.");
					}
				}
			}
				input.close();	
	}

}
