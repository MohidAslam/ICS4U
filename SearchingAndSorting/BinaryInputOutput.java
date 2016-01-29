/**
 * 
 */
package Searching;

import java.util.Scanner;

/**
 * @author Mohid Aslam
 *
 */
public class BinaryInputOutput {
	
/**
 * 
 * @param args args
 */
	public static void main(String[] args) {
		//Ordered array from which linear search will happen.
		int[] int1 = {1,2,34,44,46,58,79,89,95,102,130,150,168,720};
		double[] doubles = {1.59,2.12,34.16,44.89,46.56,58.18,79.68,89.49,95.61,102.61,130.91,150.98,168.39,720.28};
		String[] strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z"};
		
		//targets for the linear search to find
		int targetInt = 168;
		double targetDouble= 2.12;
		String targetString = "Falcon";
		
		//scanner initialized
		Scanner s = new Scanner(System.in);

		//object initialized
		BinarySearch search = new BinarySearch();
		
		//indexes of the targets recoded to use to print in methods
	   binarySearchInt(int1, targetInt);
	   binarySearchDouble(doubles, targetInt);
	   binarySearchString(strings, targetString);
		
	}
	/**
	 * Prints in which index the target value of the integer was found. If the target value is not found, "target value is not found"
	 * @param indexOfInt Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetInt Target value which was/was not found
	 */
	public static void binaryInt(int indexOfInt, int targetInt )
	{
		if (indexOfInt >= 0)
		{
			System.out.println(targetInt + " was found at " + (indexOfInt+1) + " index of the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else
		{
			System.out.println(targetInt + " in not in the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
	
	/**
	 * Prints in which index the target value of the double was found. If the target value is not found, "target value is not found"
	 * @param indexOfDouble Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetDouble Target value which was/was not found
	 */
	public static void PrintDouble(int indexOfDouble, double targetDouble)
	{
		if (indexOfDouble >= 0)
		{
			System.out.println(targetDouble + " was found at " + (indexOfDouble+1) + " index of the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else
		{
			System.out.println(targetDouble + " in not in the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		
	}
	
	/**
	 * Prints in which index the target value of the string was found. If the target value is not found, "target value is not found"
	 * @param indexOfString Index of the target from the array, if target is not found in the array, -1 is returned from the search method 
	 * @param targetString Target value which was/was not found
	 */
	public static void PrintString(int indexOfString, String targetString)
	{
		if (indexOfString >= 0)
		{
			System.out.println(targetString + " was found at " + (indexOfString+1) + " index of the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else
		{
			System.out.println(targetString + " in not in the array.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		
	}
	public static int binarySearchDouble(double[] ints, double target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = ints.length;
		mid = ((beg + end)/2) +1;
		
		for (int i = 0; i < ints.length; i++)
		{
			if (target > ints[mid])
			{
				mid = beg+1;	
			}
			else if (target < ints[mid])
			{
				mid = end-1;
			}
			else if (target == ints[mid])
			{
				i= ints.length;
				return mid;
			}
			
		}
		
		
		return -1;
	}
	/**
	 * 
	 * @param ints in an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
	public static int binarySearchString(String[] ints, String target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = ints.length;
		mid = ((beg + end)/2) +1;
		
		for (int i = 0; i < ints.length; i++)
		{
			if (target.compareTo( ints[mid]) > 0)
			{
				mid = beg+1;	
			}
			else if (target.compareTo(ints[mid]) < 0 )
			{
				mid = end-1;
			}
			else if (target.compareTo(ints[mid]) == 0)
			{
				i= ints.length;
				return mid;
			}
			
		}
		
		return -1;	
	}
	public static int binarySearchInt(int[] ints, int target)
	{
		int beg; int end; int mid;
		beg = 0;
		end = ints.length;
		mid = ((beg + end)/2) +1;
		
		for (int i = 0; i < ints.length; i++)
		{
			if (target > ints[mid])
			{
				mid = beg+1;	
			}
			else if (target < ints[mid])
			{
				mid = end-1;
			}
			else if (target == ints[mid])
			{
				i= ints.length;
				return mid;
			}
			
		}
		
		
		return -1;
	}
}
