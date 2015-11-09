/**
 * 
 */
package aslam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
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
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// TODO Auto-generated method stub 
		ArrayList<ContestantInformation> contestants = new ArrayList<ContestantInformation>();
		String input= null;
		
		do{
			System.out.print("\n" +"Please choose one of the options:" +"\n" + 
					"1. Add a new contestant." + "\n" + "2. Search a contestant." +"\n" +
					"3. Print Label"+ "\n"+ "4. Remove a contestant."+ "\n"+ "5. Remove all contestants." + 
					"\n" + "6. Save file."+ "\n" + "7. Load file.");
			 input = scan.nextLine();
			
			if (input.equals("1")){
			addContestant(contestants);
			}
			else if(input.equals("2")){
				System.out.print("Please enter their first name.");
				input = scan.nextLine();
				String searchFirstName = input;
				
				System.out.print("Please enter their last name.");
				input = scan.nextLine();
				String searchLastName = input;
				int binaryIndex = Search.binaryStringSearch(contestants, searchFirstName, searchLastName);
				System.out.println("The contestant, "+ searchFirstName + " "+ searchLastName+", is found at index " +binaryIndex);
			}
			else if (input.equals("3")){
				printContestants(contestants);
			}
			else if (input.equals("4")){
				System.out.print("Please enter their first name.");
				input = scan.nextLine();
				String searchFirstName = input;
				
				System.out.print("Please enter their last name.");
				input = scan.nextLine();
				String searchLastName = input;
				int binaryIndex = Search.binaryStringSearch(contestants, searchFirstName, searchLastName);
				contestants.remove(binaryIndex);
			}
			else if(input.equals("5")){
				contestants.removeAll(contestants);
			}
			else if(input.equals("6")){
				saveFile(contestants);
			}
			else if(input.equals("7")){
				loadFile(contestants);
			}
		}while(input != "5");
	}
/**
 * 
 * @param contestants
 * @throws FileNotFoundException 
 */
	public static void saveFile(ArrayList<ContestantInformation> contestants) throws FileNotFoundException {
		
		for (int i = 0; i <contestants.size(); i++){
			FileOutputStream fileOutputStream=new FileOutputStream("contestantFile.txt");
			PrintStream fps = new PrintStream(fileOutputStream);
			fps.println(contestants.size());
			fps.println(contestants.get(i).getFirstName());
		}			
	}
	/**
	 * 
	 * @param contestants
	 * @throws FileNotFoundException
	 */
	public static void loadFile(ArrayList<ContestantInformation> contestants) throws FileNotFoundException{
		BufferedReader fbr = new BufferedReader(new FileReader("contestantFile.txt"));
		try{
			int size = Integer.parseInt(fbr.readLine());
			for(int i = 0; i < size; i++){
				String firstName = fbr.readLine();
				String lastName = fbr.readLine();
				String streetName = fbr.readLine(); 
				String streetNumber = fbr.readLine();
				String city = fbr.readLine();
				String province = fbr.readLine();
				String postalCode = fbr.readLine();
				String birthDate = fbr.readLine();
				String phoneNumber = fbr.readLine();
				
				try {
					contestants.add(new ContestantInformation(firstName, lastName, streetName,
							streetNumber, city, province, postalCode, birthDate,phoneNumber));
				} catch (InvalidInputException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}catch(IOException e){
			System.out.print("File is not formatted properly.");
		}
		
	}
	public static void printContestants(ArrayList<ContestantInformation> contestants){
		for(int i = 0; i<contestants.size();i++){
			Label label = new Label(contestants.get(i));
			System.out.println(label.toString());
		}
		
	}
	/**
	 * 
	 * @param contestants
	 */
	public static void addContestant(ArrayList<ContestantInformation>contestants){
		ContestantInformation contestant = new ContestantInformation();
		boolean flag = false;
		do{
			try{
				flag = false;
				System.out.print("Please enter your first name.");
				String firstName = scan.nextLine();
				contestant.setFirstName(firstName);
			}
			catch (InvalidInputException firstName){
				System.out.print(firstName.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your last name.");
				String lastName = scan.nextLine();
				contestant.setLastName(lastName);
			}
			catch (InvalidInputException lastName){
				System.out.print(lastName.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your street number.");
				String streetNumber = scan.nextLine();
				contestant.setStreetNumber(streetNumber);
			}
			catch (InvalidInputException streetNumber){
				System.out.print(streetNumber.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your street name.");
				String streetName = scan.nextLine();
				contestant.setStreetName(streetName);
			}
			catch (InvalidInputException streetName){
				System.out.print(streetName.getMessage());
				flag = true;
			}
		}
		while(flag);
				
		do{
			try{
				flag = false;
				System.out.print("Please enter your city.");
				String city = scan.nextLine();
				contestant.setCity(city);
			}
			catch (InvalidInputException city){
				System.out.print(city.getMessage());
				flag = true;
			}
		}
		while(flag);
				
		System.out.print("Please enter your province.");	
		String province = scan.nextLine();	
		contestant.setProvince(province);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your postal code.");
				String postalCode = scan.nextLine();
				contestant.setPostalCode(postalCode);
			}
			catch (InvalidInputException postalCode){
				System.out.print(postalCode.getMessage());
				flag = true;
			}
		}
		while(flag);
		
		do{
			try{
				flag = false;
				System.out.print("Please enter your birth date.");
				String birthDate = scan.nextLine();
				contestant.setBirthDate(birthDate);
			}
			catch (InvalidInputException birthDate){
				System.out.print(birthDate.getMessage());
				flag = true; 
			}
		}
		while(flag);
		
		do{		
			try{
				flag = false;
				System.out.print("Please enter your phone number.");
				String phoneNumber = scan.nextLine();
				contestant.setPhoneNumber(phoneNumber);
			}
			catch (InvalidInputException phoneNumber){
				System.out.print(phoneNumber.getMessage());
				flag = true;
			}
		}
		while(flag); 
		
		contestants.add(contestant);
	}
	
}
