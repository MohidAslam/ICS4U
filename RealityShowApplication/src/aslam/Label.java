/**
 * 
 */
package aslam;

/**
 * This class formats all of the contestants information to be printed in the main.
 *
 * @author Mohid Aslam
 * 
 */
public class Label {
	/**
	 * 
	 */
	public Label() {
		
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private ContestantInformation ci1;		
	/**
	 * @param ci
	 */
	public Label(ContestantInformation ci){		
		this.ci1 = ci;			
		formatName();			
		formatAddress();
		formatNumber();
	}
	/**
	 * @return number
	 */
	public String formatNumber() {
		String phoneNum = ci1.getPhoneNumber();
		String number = (String.valueOf(phoneNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
		return number;
	}
	/**
	 * @return address
	 */
	public String formatAddress() {
		int midPoint = ci1.getPostalCode().length()/2;
		char[] ps = ci1.getPostalCode().toCharArray();
		String postalCode = Character.toString(ps[0]) + Character.toString(ps[1]) 
		+ Character.toString(ps[2]) +' ' + Character.toString(ps[3]) + 
		Character.toString(ps[4]) + Character.toString(ps[5]);
		String address = ci1.getStreetNumber() + " " + ci1.getStreetName() + 
				"\n" + ci1.getCity() + ", " + ci1.getProvince() + "\n" 
				+ postalCode + "\n" ;
		return address;
	}
	/**
	 * 
	 * @return name
	 */
	public String formatName() {
		String name = ci1.getLastName() + ", " + ci1.getFirstName() + "\n";
		return name;
	}
	/**
	 * @return output
	 */
	public String toString(){
		String output ="\n"+ formatName() + formatAddress() + formatNumber();
		return output;
	}
}
