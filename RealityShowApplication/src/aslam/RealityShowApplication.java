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
 * This is the main class. It creates an arraylist that holds a contestants information.
 * The user can search for a contestant, print a label for the contestams, remove contestants 
 * and save/load the array lists to/from a file.
 * 
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
	public static void main(String[] args) throws FileNotFoundException { //main method

		// TODO Auto-generated method stub 
		ArrayList<ContestantInformation> contestants = new ArrayList<ContestantInformation>();
		String input= null;
		
		do{
			System.out.print("\n" +"Please choose one of the options:" +"\n" +  // option menu
					"1. Add a new contestant." + "\n" + "2. Search a contestant." +"\n" +
					"3. Print Label"+ "\n"+ "4. Remove a contestant."+ "\n"+ "5. Remove all contestants." + 
					"\n" + "6. Save file."+ "\n" + "7. Load file."+ "\n" + "8. Quit.");
			 input = scan.nextLine();
			
			if (input.equals("1")){ //if statements for option menu
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
			else if(input.equals("8")){
				System.exit(0);
			}
		}while(input != "9");
	}
/**
 * 
 * @param contestants
 * @throws FileNotFoundException 
 */
	public static void saveFile(ArrayList<ContestantInformation> contestants) throws FileNotFoundException { // save method, saves all of the information to a file
		FileOutputStream fileOutputStream = new FileOutputStream("contestantFile.txt");
		PrintStream fps = new PrintStream(fileOutputStream);
		fps.println(contestants.size());
		for (int i = 0; i < contestants.size(); i++){
			fps.println(contestants.get(i).getFirstName());
			fps.println(contestants.get(i).getLastName());
			fps.println(contestants.get(i).getStreetNumber());
			fps.println(contestants.get(i).getStreetName());
			fps.println(contestants.get(i).getCity());
			fps.println(contestants.get(i).getProvince());
			fps.println(contestants.get(i).getPostalCode());
			fps.println(contestants.get(i).getBirthDate());
			fps.println(contestants.get(i).getPhoneNumber());
		}	
		try {
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param contestants
	 * @throws FileNotFoundException
	 */
	public static void loadFile(ArrayList<ContestantInformation> contestants) throws FileNotFoundException{//load method, loads all information from a file 
		contestants.removeAll(contestants);
		BufferedReader fbr = new BufferedReader(new FileReader("contestantFile.txt"));
		try{
			int size = Integer.parseInt(fbr.readLine());
			for(int i = 0; i < size; i++){
				String firstName = fbr.readLine();
				String lastName = fbr.readLine();
				String streetNumber = fbr.readLine(); 
				String streetName = fbr.readLine();
				String city = fbr.readLine();
				String province = fbr.readLine();
				String postalCode = fbr.readLine();
				String birthDate = fbr.readLine();
				String phoneNumber = fbr.readLine();
				try {
					contestants.add(new ContestantInformation(firstName, lastName, streetNumber,
							streetName, city, province, postalCode, birthDate,phoneNumber));
				} catch (InvalidInputException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}catch(IOException e){
			System.out.print("File is not formatted properly.");
		}
		
	}
	public static void printContestants(ArrayList<ContestantInformation> contestants){// print method, displays the all contestants information
		for(int i = 0; i < contestants.size();i++){
			Label label = new Label(contestants.get(i));
			System.out.println(label.toString());
		}
	}
	/**
	 * 
	 * @param contestants
	 */
	public static void addContestant(ArrayList<ContestantInformation>contestants){//asks user for information
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
				System.out.print("Please enter your birth date. (eg. YYYY/MM/DD");
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
		
		System.out.println("Skill testing question:" + "\n" + "What is 2*2+2/2");
		String answer = scan.nextLine();
		if(answer == "5"){
			System.out.println("Congratulations you have qualified to be a contestant.");
			contestants.add(contestant);
		}
	}
}
