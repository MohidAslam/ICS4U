/**
 * 
 */
package aslam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mohid Aslam
 *
 */
public class RealityShowApplication {
	 static Scanner scan = new Scanner(System.in);

	/**
	 * 
	 */
	public RealityShowApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> contestantInformation = new ArrayList<String>();
		boolean flag = false;
		ContestantInformation contestant1 = new ContestantInformation();
		do{
			try{
				flag = false;
				System.out.print("Please enter your first name.");
				String firstName = scan.nextLine();
				contestant1.setFirstName(firstName);
			}
			catch (InvalidInputException a){
				System.out.print(a.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your last name.");
				String lastName = scan.nextLine();
				contestant1.setLastName(lastName);
			}
			catch (InvalidInputException b){
				System.out.print(b.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your street number.");
				String streetNumber = scan.nextLine();
				contestant1.setStreetNumber(streetNumber);
			}
			catch (InvalidInputException c){
				System.out.print(c.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your street name.");
				String streetName = scan.nextLine();
				contestant1.setStreetName(streetName);
			}
			catch (InvalidInputException d){
				System.out.print(d.getMessage());
				flag = true;
			}
		}
		while(flag);
				
		do{
			try{
				flag = false;
				System.out.print("Please enter your city.");
				String city = scan.nextLine();
				contestant1.setCity(city);
			}
			catch (InvalidInputException e){
				System.out.print(e.getMessage());
				flag = true;
			}
		}
		while(flag);
				
		System.out.print("Please enter your province.");	
		String province = scan.nextLine();	
		contestant1.setProvince(province);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your postal code.");
				String postalCode = scan.nextLine();
				contestant1.setPostalCode(postalCode);
			}
			catch (InvalidInputException f){
				System.out.print(f.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your birth date.");
				String birthDate = scan.nextLine();
				contestant1.setBirthDate(birthDate);
			}
			catch (InvalidInputException g){
				System.out.print(g.getMessage());
				flag = true; 
			}
		}
		while(flag);
		
		do{		
			try{
				flag = false;
				System.out.print("Please enter your phone number.");
				String phoneNumber = scan.nextLine();
				contestant1.setPhoneNumber(phoneNumber);
			}
			catch (InvalidInputException h){
				System.out.print(h.getMessage());
				flag = true;
			}
		}
		while(flag); 
		
		System.out.println("Please answer the following skill testing question.");
		System.out.println("What is 2+2x2/2?");
		String input = scan.nextLine();
		int answer = Integer.parseInt(input);
		boolean userAnswer = false;
		if (answer == 4){
			userAnswer = true;
		}
		Label label = new Label(contestant1);
		System.out.println(label.toString());
		if (userAnswer == true){
			System.out.println("You got the skill testing question right.");
		}
		else{
			System.out.println("You got the skill testing question wrong.");
		}
	}
}
