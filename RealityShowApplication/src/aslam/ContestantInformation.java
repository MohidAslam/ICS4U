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
 *September 23 2015
 */
public class ContestantInformation {
	
	private String firstName, lastName, streetName, streetNumber, city,
	postalCode, birthDate, phoneNumber;
	private String province;
	/**
	 * Empty constructor
	 */
	public ContestantInformation() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * @param g
	 * @param h
	 * @param i
	 */
	public ContestantInformation(String a, String b, String c, String d, String e, 
			String f, String g, String h, String i){
		
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 * @throws InvalidInputException 
	 * 
	 */
	public void setFirstName(String firstName) throws InvalidInputException{
		if(firstName.length() == 0){
			throw new InvalidInputException("You cannot leave your first name empty.");
		}
		for(int i = 0; i < firstName.length(); i ++){
			if (Character.isDigit(firstName.charAt(i)))
			throw new InvalidInputException("You cannot have a number in your name.");
			}
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 * @throws InvalidInputException 
	 */
	public void setLastName(String lastName) throws InvalidInputException {
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your last name empty.");
		}
		for(int i = 0; i < lastName.length(); i ++){
			if (Character.isDigit(lastName.charAt(i))){
			throw new InvalidInputException("You cannot have a number in your name.");
			}
		}
		this.lastName = lastName;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 * @throws InvalidInputException 
	 */
	public void setStreetName(String streetName) throws InvalidInputException {
		if(streetName.length() == 0){
			throw new InvalidInputException("You cannot leave your street name empty.");
		}
		this.streetName = streetName;
	}
	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {
		return streetNumber;
	}
	/**
	 * @param streetNumber the streetNumber to set
	 * @throws InvalidInputException 
	 */
	public void setStreetNumber(String streetNumber) throws InvalidInputException {
		if(streetNumber.length() == 0){
			throw new InvalidInputException("You cannot leave your street number empty.");
		}
		this.streetNumber = streetNumber;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 * @throws InvalidInputException 
	 */
	public void setCity(String city) throws InvalidInputException {
		if(city.length() == 0){
			throw new InvalidInputException("You cannot leave your city empty.");
		}
		this.city = city;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 * @throws InvalidInputException 
	 */
	public void setPostalCode(String postalCode) throws InvalidInputException {
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your postal code empty.");
		}
		if (postalCode.length() > 6 
				|| postalCode.length() < 6){
			throw new InvalidInputException("Postal code must be only 6 characters "
					+ "long (no spaces).");
		}	
		for(int i = 0; i <6; i += 2){
			if (!Character.isLetter(postalCode.charAt(i))){
			throw new InvalidInputException("Postal code must  follow the format, "
					+ "number then letter: X#X#X#");
			}
		}
		for(int i = 1; i <6; i += 2){
			if (!Character.isDigit(postalCode.charAt(i))){
			throw new InvalidInputException("Postal code must  follow the format, "
					+ "number then letter: X#X#X#");
			}
		}
		this.postalCode = postalCode;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
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
	public String getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 * @throws InvalidInputException 
	 */
	public void setBirthDate(String birthDate) throws InvalidInputException {
		if(birthDate.length() == 0){
			throw new InvalidInputException("You cannot leave your birth date empty.");
		}
		this.birthDate = birthDate;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 * @throws InvalidInputException 
	 */
	public void setPhoneNumber(String phoneNumber) throws InvalidInputException {
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your phone number empty.");
		}
		if (phoneNumber.length() > 10  
				|| phoneNumber.length() < 10){
			throw new InvalidInputException("Phone number must only be 10 characters "
					+ "long (no spaces or dashes).");
		}
		this.phoneNumber = phoneNumber;
	}
	public String toString(){
		return firstName + " " + lastName + " " + streetName + " " + streetNumber 
				+ " " + city + " " + province + " " + postalCode + " " + birthDate
				+ " " + phoneNumber ;	
	}
}
