/**
 * 
 */
package aslam;
import java.util.ArrayList;
/**
 * This class is used to search for a specific contestant and is used by the main method.
 * 
 * 
 * @author Mohid Aslam
 * 
 */
public class Search {

	public Search() {
		
	}
	public static int linearStringSearch(ArrayList<ContestantInformation> contestants, String searchFirstName, String searchLastName){
		
		for(int i = 0; i < contestants.size(); i++){
			
			if( contestants.get(i).getLastName().equals(searchLastName)){
				
				if( contestants.get(i).getFirstName().equals(searchFirstName)){
					return i;
				}
			}
		}
		return -1;
	}

	/*public static int binaryIntSearch(int[] intSearchArray, int intTarget){
		
		boolean found = false;
		int begIndex = 0;
		int endIndex = intSearchArray.length - 1;
		int midIndex = (begIndex + endIndex)/2;
		int indexFound = 0;
		if( intTarget >= intSearchArray.length)
		{
			indexFound = -1; 
		}
		else{
			for (int i = 0; i < intSearchArray.length; i++){
				if(intSearchArray[midIndex] == intTarget){
					found = true;
					indexFound = midIndex;
					break;
				}
				else if(intSearchArray[midIndex] < intTarget){
					begIndex = midIndex + 1;
					midIndex = ((endIndex - begIndex)/2) + begIndex;
					found = false;
					indexFound = midIndex;
				}
				else if(intSearchArray[midIndex] > intTarget){
					endIndex = midIndex - 1;
					midIndex = endIndex - ((begIndex + endIndex)/2) ;
					found = false;
					indexFound = midIndex;
				}
			}
		}
		return indexFound;
	}*/
	public static int binaryStringSearch(ArrayList<ContestantInformation> contestants, 
			String searchFirstName, String searchLastName){
		int begIndex = 0;
		int endIndex = contestants.size();
		int midIndex = (endIndex + begIndex)/2;
		int found = -1;
		
		do{
			if(searchLastName.compareTo(contestants.get(midIndex).getLastName()) == 1)
			{
				begIndex = midIndex + 1;
				midIndex = ((endIndex - begIndex)/2) + begIndex;
				found =-1;
			}
			else if(searchLastName.compareTo(contestants.get(midIndex).getLastName()) == -1)
			{
				endIndex = midIndex - 1;
				midIndex = endIndex - ((begIndex + endIndex)/2) ;
				found =-1;
			}
			else if(searchLastName.compareTo(contestants.get(midIndex).getLastName()) == 0)
			{
				begIndex = 0;
				endIndex = contestants.size()-1;
				midIndex = (endIndex + begIndex)/2;
				
				if(searchFirstName.compareTo(contestants.get(midIndex).getFirstName())==1){
					begIndex = midIndex + 1;
					midIndex = ((endIndex - begIndex)/2) + begIndex;
					found =-1;
				}
				else if(searchFirstName.compareTo(contestants.get(midIndex).getFirstName())==-1){
					endIndex = midIndex - 1;
					midIndex = endIndex - ((begIndex + endIndex)/2) ;
					found =-1;
				}
				else if(searchFirstName.compareTo(contestants.get(midIndex).getFirstName())==0){
					found = midIndex;
				}
				
				
			}
		}while(found != midIndex);
		return found;
	}
	/*public int binaryStringSearch(ArrayList<String>contestants, String searchFirstName, String searchLastName){
		
		return binaryStringSearch(contestants, searchFirstName, searchLastName, 0, contestants.size()-1);
		
	}
	private int binaryStringSearch(ArrayList<String>contestants, String searchFirstName, 
			String searchLastName, int beg, int end){
		if( beg>end)
			return -1;
		int midIndex=(beg+end)/2;
		if(searchLastName.compareTo(contestants.get(midIndex).getLastName()) == 1)
		return end;
		
	}*/
}
