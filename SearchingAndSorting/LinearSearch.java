package Searching;
/**
 * 
 * @author Mohid Aslam
 *
 */
public class LinearSearch {
	
	/**
	 * 
	 * @param ints an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
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
	
	/**
	 * 
	 * @param ints an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
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
	
	
	/**
	 * 
	 * @param ints  an array of numbers given to search the target from
	 * @param target target value to search for in the array
	 * @return if the target is found in the array, the index of the target in the array is returned, else if the value is not found, -1 is returned
	 */
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
