/**
 * 
 */
package aslam;
/** 
 *  This class holds the information of a contestant.
 *   It has fields for first name, last name, street address,
 *   city, province, postal code, phone number and birth date.
 *    
 * @author Mohid Aslam
 *
 */
public class ContestantInformation implements Comparable {
	
	private String firstName, lastName, streetName, streetNumber, city,
	province, postalCode, birthDate, phoneNumber;
	/**
	 * Empty constructor
	 */
	
	
	public ContestantInformation() { // variables
		firstName = "" ;
		lastName = "" ;
		streetName = ""; 
		streetNumber = "";
		city = "";
		province = "";
		postalCode = "";
		birthDate = "";
		phoneNumber = "";
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param streetName
	 * @param streetNumber
	 * @param city
	 * @param province
	 * @param postalCode
	 * @param birthDate
	 * @param phoneNumber
	 * @throws InvalidInputException 
	 */

	public ContestantInformation(String firstName, String lastName, String streetName, String streetNumber, String city, 
			String province, String postalCode, String birthDate, String phoneNumber) throws InvalidInputException{ //variables
		
		setFirstName(firstName);	
		setLastName(lastName);	
		setStreetName(streetName);	
		setStreetNumber(streetNumber);	
		setCity(city);	
		setProvince(province);	
		setPostalCode(postalCode);	
		setBirthDate(birthDate);	
		setPhoneNumber(phoneNumber);
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {	//getter for first name
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 * @throws InvalidInputException 
	 * 
	 */

	public void setFirstName(String firstName) throws InvalidInputException{ //setter for first name
		if(firstName.length() == 0){
			throw new InvalidInputException("You cannot leave your first name empty.");//exception to make sure the user types in something
		}
		for(int i = 0; i < firstName.length(); i ++){
			if (Character.isDigit(firstName.charAt(i)))
			throw new InvalidInputException("You cannot have a number in your name.");//exception to make sure the user has not inputed a number into their name
			}
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {// getter for last name
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 * @throws InvalidInputException 
	 */
	public void setLastName(String lastName) throws InvalidInputException {// setter for last name
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your last name empty.");//exception to make sure the user types in something
		}
		for(int i = 0; i < lastName.length(); i ++){
			if (Character.isDigit(lastName.charAt(i))){
			throw new InvalidInputException("You cannot have a number in your name.");//exception to make sure the user has not inputed a number into their name
			}
		}
		this.lastName = lastName;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {//getter for street name
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 * @throws InvalidInputException 
	 */
	public void setStreetName(String streetName) throws InvalidInputException {//setter street name
		if(streetName.length() == 0){
			throw new InvalidInputException("You cannot leave your street name empty.");//exception to make sure the user types in something
		}
		this.streetName = streetName;
	}
	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {//getter for street number
		return streetNumber;
	}
	/**
	 * @param streetNumber the streetNumber to set
	 * @throws InvalidInputException 
	 */
	public void setStreetNumber(String streetNumber) throws InvalidInputException {//setter for street number
		if(streetNumber.length() == 0){
			throw new InvalidInputException("You cannot leave your street number empty.");//exception to make sure the user types in something
		}
		this.streetNumber = streetNumber;
	}
	/**
	 * @return the city
	 */
	public String getCity() {//getter for city
		return city;
	}
	/**
	 * @param city the city to set
	 * @throws InvalidInputException 
	 */
	public void setCity(String city) throws InvalidInputException {//setter for city
		if(city.length() == 0){
			throw new InvalidInputException("You cannot leave your city empty.");//exception to make sure the user types in something
		}
		this.city = city;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {//getter for postal code
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 * @throws InvalidInputException 
	 */
	public void setPostalCode(String postalCode) throws InvalidInputException {//setter for postal code
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your postal code empty.");//exception to make sure the user types in something
		}
		if (postalCode.length() > 6 
				|| postalCode.length() < 6){
			throw new InvalidInputException("Postal code must be only 6 characters "//exception to make sure that the postal code is only 6 characters long
					+ "long (no spaces).");
		}	
		for(int i = 0; i <6; i += 2){
			if (!Character.isLetter(postalCode.charAt(i))){
			throw new InvalidInputException("Postal code must  follow the format, " //excepption to make sure the postal code follows the format X#X#X#
					+ "number then letter: X#X#X#");
			}
		}
		for(int i = 1; i <6; i += 2){
			if (!Character.isDigit(postalCode.charAt(i))){
			throw new InvalidInputException("Postal code must  follow the format, "//excepption to make sure the postal code follows the format X#X#X#
					+ "number then letter: X#X#X#");
			}
		}
		this.postalCode = postalCode;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {//getter for province
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {//setter for province
		//using an enum, the provinces are formatted to look as they do in 
	    //they enum class no matter what the user type
		switch(province){
		case "Ontario": province = Provinces.ON.toString();
		case "ontario": province = Provinces.ON.toString();
			break;
		case "Manitoba": province = Provinces.MB.toString();
		case "manitoba": province = Provinces.MB.toString();
			break;
		case "Alberta": province = Provinces.QC.toString();
		case "alberta": province = Provinces.QC.toString();
			break;
		case "Quebec": province = Provinces.QC.toString();
		case "quebec": province = Provinces.QC.toString();
			break;
		case "Nunavut": province = Provinces.NU.toString();
		case "nunavut": province = Provinces.NU.toString();
			break;
		case "Yukon": province = Provinces.YT.toString();
		case "yukon": province = Provinces.YT.toString();
		case "Yukon Territory": province = Provinces.YT.toString();
		case "yukon territory": province = Provinces.YT.toString();
			break;
		case "British Columbia": province = Provinces.BC.toString();
		case "british columbia": province = Provinces.BC.toString();
			break;
		case "Prince Edward Island": province = Provinces.PEI.toString();
		case "prince edward island": province = Provinces.PEI.toString();
		case "PEI": province = Provinces.PEI.toString();
		case "pei": province = Provinces.PEI.toString();
		case "P.E.I":	 province = Provinces.PEI.toString();
			break;
		case "Newfound Land and Labrador": province = Provinces.NL.toString();
		case "Newfound Land": province = Provinces.NL.toString();
		case "newfound land": province = Provinces.NL.toString();
		case "newfound land and labrador": province = Provinces.NL.toString();
			break;
		case "New Brunswick": province = Provinces.NB.toString();
		case "new brunswick": province = Provinces.NB.toString();
			break;
		case "Saskatchewan": province = Provinces.SK.toString();
		case "saskatchewan": province = Provinces.SK.toString();
			break;
		case "North West Territory": province = Provinces.NWT.toString();
		case "north west territory": province = Provinces.NWT.toString();

			break;
		case "Nova Scotia": province = Provinces.NS.toString();
		case "nova scotia": province = Provinces.NS.toString();
		}
		
		this.province = province;
	}
	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {//getter for birth date
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 * @throws InvalidInputException 
	 */
	public void setBirthDate(String birthDate) throws InvalidInputException {//setter for birthdate
		if(birthDate.length() == 0){
			throw new InvalidInputException("You cannot leave your birth date empty."); //exception to make sure the user types in something.
		}
		String number = birthDate.substring(0, 4);
		int age = 2016 - Integer.parseInt(number);
		if (age < 18 && age >0){
			throw new InvalidInputException("You are not old enough to apply.");//exception to make sure the contestant is old enough.
		}
		else if (age < 0)
		{
			throw new InvalidInputException("Please enter a real birth date.");	//exception to make sure that the birth date is not in the future.
		}
		this.birthDate = birthDate;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {//getter for phone number
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 * @throws InvalidInputException 
	 */
	public void setPhoneNumber(String phoneNumber) throws InvalidInputException {//setter for phone number
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your phone number empty.");//exception to make sure the user does not leave this empty
		}
		if (phoneNumber.length() > 10  
				|| phoneNumber.length() < 10){
			throw new InvalidInputException("Phone number must only be 10 characters "//exception to make sure the phone number is formatted properly
					+ "long (no spaces or dashes).");
		}
		this.phoneNumber = phoneNumber;
	}
	
	public String toString(){//to string that holds all of a contestants information
		return firstName + " " + lastName + " " + streetName + " " + streetNumber 
				+ " " + city + " " + province + " " + postalCode + " " + birthDate
				+ " " + phoneNumber ;	
	}
	public int compareTo(ContestantInformation contestant1){
		
		if(contestant1.getFirstName().compareTo(this.firstName) == 0){
			return 0;
		}
		else if(contestant1.getFirstName().compareTo(this.firstName) == 1){
			return 1;
		}
		else { //(contestant1.getFirstName().compareTo(this.firstName) == -1)
			return -1;
		}
	}
	public int compareTo(Object args) {
		ContestantInformation ci= (ContestantInformation) args;
		return 0;
	}
}
