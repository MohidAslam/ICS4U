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
	private Provinces province;
	/**
	 * Empty constructor
	 */
	public ContestantInformation(){
	
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
			Provinces f, String g, String h, String i){
		
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 * @throws InvlaidInputException
	 */
	public void setFirstName(String firstName)throws InvlaidInputException{
		if(firstName.length() == 0){
			throw new InvalidInputException("You cannot leave your first name empty.")
		}
		for(int i = 0; i <= 10; i += 1){
			if (Character.isDigit(firstName(i)){
			throw new InvalidInputException("You cannot have a number in your name.")
			}
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
	 * @throws InvlaidInputException
	 */
	public void setLastName(String lastName) throws InvlaidInputException {
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your last name empty.")
		}
		for(int i = 0; i <= 10; i += 1){
			if (Character.isDigit(firstName(i)){
			throw new InvalidInputException("You cannot have a number in your name.")
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
	 * @throws InvlaidInputException
	 */
	public void setStreetName(String streetName) throws InvlaidInputException {
		if(streetName.length() == 0){
			throw new InvalidInputException("You cannot leave your street name empty.")
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
	 * @throws InvlaidInputException
	 */
	public void setStreetNumber(String streetNumber) throws InvlaidInputException {
		if(streetName.length() == 0){
			throw new InvalidInputException("You cannot leave your street number empty.")
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
	 * @throws InvlaidInputException
	 */
	public void setCity(String city) throws InvlaidInputException {
		if(city.length() == 0){
			throw new InvalidInputException("You cannot leave your city empty.")
		}
		this.city = city;
	}
	/**
	 * @return the province
	 */
	public Provinces getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 * @throws InvlaidInputException
	 */
	public void setProvince(Provinces province) throws InvlaidInputException {
		this.province = province;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode(){
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 * @throws InvlaidInputException
	 */
	public void setPostalCode(String postalCode) throws InvlaidInputException {
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your postal code empty.")
		}
		if (postalCode.length() > 6 
				|| postalCode.length() < 6){
			throw new InvalidInputException("Postal code must be only 6 characters "
					+ "long (no spaces).")
		}	
		for(int i = 0; i <=6; i += 2){
			if (!Character.isLetter(postalCode(i)){
			throw new InvalidInputException("Postal code must  follow the format, "
					+ "number then letter: X#X#X#");
			}
		}
		for(int i = 1; i <=6; i += 2){
			if (!Character.isDigit(postalCode(i)){
			throw new InvalidInputException("Postal code must  follow the format, "
					+ "number then letter: X#X#X#");
			}
		}
		this.postalCode = postalCode;
	}
	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 * @throws InvlaidInputException
	 */
	public void setBirthDate(String birthDate) throws InvlaidInputException {
		if(birthDate.length() == 0){
			throw new InvalidInputException("You cannot leave your birth date empty.")
		}
		this.birthDate = birthDate;
	}
	/**
	 * @return the phoneNumber 
	 */
	public String getPhoneNumber(){
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 * @throws InvlaidInputException
	 */
	public void setPhoneNumber(String phoneNumber) throws InvlaidInputException {
		if(lastName.length() == 0){
			throw new InvalidInputException("You cannot leave your phone number empty.")
		}
		if (phoneNumber.length() > 10  
				|| phonNumber.length() < 10){
			throw new InvlaidInputException("Phone number must only be 10 characters "
					+ "long (no spaces or dashes).")
		}
		this.phoneNumber = phoneNumber;
	}
	
	public String toString(){
		return firstName + " " + lastName + " " + streetName + " " + streetNumber 
				+ " " + city + " " + province + " " + postalCode + " " + birthDate
				+ " " + phoneNumber ;	
	}
	
}

