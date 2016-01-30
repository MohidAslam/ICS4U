/**
 * 
 */
package mySearching;

import java.util.Scanner;
/**
 * @author Mohid Aslam
 *
 */
public class myLinearSearch {

	public static void main(String[] args) {
		//Ordered array from which linear search will happen.
		int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		double[] doubles = {1.23, 1.123, 5.234, 7.234, 3.4, 1.2, 6.7, 4.9};
		String[] strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z"};
		
		int targetInt = 168;
		double targetDouble= 2.12;
		String targetString = "C";
		
		Scanner s = new Scanner(System.in);
		
		boolean flag = false;
		do 
		{
			System.out.println("Choose a search Method");
			System.out.println("1. Linear Int search.");
			System.out.println("2. Linear Double search.");
			System.out.println("3. Linear String search.");
			
			int searchMethod = s.nextInt();
			
			if(searchMethod == 1)
			{
				int intIndex = linearSearchInt(ints, targetInt);
				System.out.println(intIndex +", " + targetInt);
			}
			else if (searchMethod == 2)
			{
				int doubleIndex = linearSearchDouble(doubles, targetDouble);
				System.out.println(doubleIndex +", " + targetInt);
			}
			else if (searchMethod == 3)
			{
				int stringIndex = linearSearchString(strings, targetString);
				System.out.println(stringIndex +", " + targetInt);
			}
			else
			{
				System.out.println("Error" + "\n");
			}
			
		}while (flag== false);
		
	}	
	public static int linearSearchInt(int[] ints, int target)
	{
		for (int i = 0; i < ints.length; i++)
		{
			if ( target == ints[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static int linearSearchDouble(double[] ints, double target)
	{
		for (int i = 0; i < ints.length; i++)
		{
			if ( target == ints[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static int linearSearchString(String[] ints, String target)
	{
		for (int i = 0; i < ints.length; i++)
		{
			if ( target.equals(ints[i]))
			{
				return i;
			}
		}
		return -1;
	}
}
