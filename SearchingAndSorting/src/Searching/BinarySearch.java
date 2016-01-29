package Searching;
/**
 * This class has  3 binary searches, one for integers, one for doubles, and one for strings
 * The way binary search works is that it looks at the target value and then compares it to the middle valus of the array.
 * If the targt value is greater than the middle value, the whole array is split into the second halof for searching.
 * If the target values is lass than the middle value, the whole array is split into the first half for searching
 * The same process keeps on going until the target value is found in the array. 
 * If the value is found in the array, the index number of where the target was found is returned.
 * If the target value is not found, then -1 is returned 
 * 
 * @author Harkirat Khurana
 *
 */
public class BinarySearch {

	/**
	 * 
	 * @param ints  in an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
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
	/**
	 * 
	 * @param ints in an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
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
		
		
		return -1;	}
	
	
	
	
	
	
	
	
}
