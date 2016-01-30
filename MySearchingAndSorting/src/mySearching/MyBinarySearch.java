/**
 * 
 */
package mySearching;

import java.util.Scanner;

/**
 * @author Mohid Aslam
 *
 */
public class MyBinarySearch {
	public static void main(String[] args) {
		int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		double[] doubles = {1.23, 1.123, 5.234, 7.234, 3.4, 1.2, 6.7, 4.9};
		String[] strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z"};
		
		int targetInt = 7;
		double targetDouble= 1.23;
		String targetString = "D";
		
Scanner s = new Scanner(System.in);
		
		boolean flag = false;
		do 
		{
			System.out.println("Choose a search Method");
			System.out.println("1. Binary Int search.");
			System.out.println("2. Binary Double search.");
			System.out.println("3. Binary String search.");
			
			int searchMethod = s.nextInt();
			
			if(searchMethod == 1)
			{
				binaryInt(binarySearchInt(ints,targetInt),targetInt);
				int intIndex = binarySearchInt(ints, targetInt);
				System.out.println(intIndex +", " + targetInt);
			}
			else if (searchMethod == 2)
			{
				binaryDouble(binarySearchDouble(doubles,targetDouble),targetDouble);
			}
			else if (searchMethod == 3)
			{
				binaryString(binarySearchString(strings,targetString),targetString);
				int stringIndex = binarySearchString(strings, targetString);
				System.out.println(stringIndex +", " + targetInt);
			}
			else
			{
				System.out.println("Error" + "\n");
			}
		}while (flag== false);
	}
	public static void binaryInt(int indexOfInt, int targetInt )
	{
		if (indexOfInt >= 0)
		{
			System.out.println(targetInt + " was found at " + (indexOfInt+1) + ".");
		}
		else
		{
			System.out.println(targetInt + " could not be found");
		}
	}
	public static void binaryDouble(int indexOfDouble, double targetDouble)
	{
		if (indexOfDouble >= 0)
		{
			System.out.println(targetDouble + " was found at " + (indexOfDouble+1) + ".");
		}
		else
		{
			System.out.println(targetDouble + " could not be found");
		}
	}
	public static void binaryString(int indexOfString, String targetString)
	{
		if (indexOfString >= 0)
		{
			System.out.println(targetString + " was found at " + (indexOfString+1) + ".");
		}
		else
		{
			System.out.println(targetString + " could not be found.");
		}
	}
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
}
