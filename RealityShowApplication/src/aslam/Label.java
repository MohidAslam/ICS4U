/**
 * 
 */
package aslam;

/**
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
	private ContestantInformation ci1;		
	public Label(ContestantInformation ci){		
		this.ci1 = ci;			
		formatName();			
		formatAddress();
		formatNumber();
	}
	public String formatNumber() {
		String phoneNum = ci1.getPhoneNumber();
		String number = (String.valueOf(phoneNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
		return number;
	}
	public String formatAddress() {
		String address = ci1.getStreetNumber() + " " + ci1.getStreetName() + 
				"\n" + ci1.getCity() + ", " + ci1.getProvince() + "\n" 
				+ ci1.getPostalCode() + "\n" ;
		return address;
	}
	public String formatName() {
		String name = ci1.getLastName() + ", " + ci1.getFirstName() + "\n";
		return name;
	}
	public String toString(){
		String output = formatName() + formatAddress() + formatNumber();
		return output;
	}
}
