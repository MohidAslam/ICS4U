package aslam;

import java.util.Scanner;

public class Greetings2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = scan.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = scan.nextLine();
		System.out.println("Hello " + firstName + " " + lastName); 
		System.out.println("Welcome to Java!");

	}

}
