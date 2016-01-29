package Sorts;


/**This class uses selection sort to re-arrange all the integers in an array in ascending order
 * 1.	Find smallest value in the list and keep track of its location
 * 2.	Switch for the first position
 * 3.	Find the next smallest #
 * 4.	Repeat with second position
 * 5.	Repeat until all the elements are in the correct position
 * 
 * @author Harkirat Khurana
 *
 */
public class SelectionSort {

	/** 
	 * The main method contains the initial array of integers.
     * First, the unsorted version of the array is printed.
     * The selectionSort method is called.
     * Finally the sorted version of the array is printed.
	 * 
	 * @param args runs the main method
	 */
	public static void main(String[] args) {

		
		int[] nums = {4,9,8,5,2,3,55,45,2,11,22,98};
	
		
		System.out.print("{");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}
		System.out.print("}");
		
		selectionSort(nums);
		
		System.out.println("");
		System.out.print("TO");
		System.out.println("");

		System.out.print("{");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}
		System.out.print("}");

	}

/**
 * This method takes an array of unsorted integers and sorts the integers in ascending order
 * This is how selection sort works:
 * 
 * 1.	Find smallest value in the list and keep track of its location
 * 2.	Switch for the first position
 * 3.	Find the next smallest #
 * 4.	Repeat with second position
 * 5.	Repeat until all the elements are in the correct position
 * 
 * @param nums Initial array of unsorted integers
 * @return returns the sorted array of integers in ascending order
 */
	public static int[] selectionSort(int[] nums)
	{

		int  sml, temp; 

		for (int i = 0; i < nums.length; i++)
		{
			for ( int j = 0; j < nums.length; j ++)
			{
				if(nums[i] < nums[j])
				{
					temp = nums[j];
					nums[j]= nums[i];
					nums[i] = temp;
					for(int m = 0; m< nums.length; m++)
					{
					//	System.out.print(nums[m] + " ");
						
					}
					//System.out.println("");
				}
			}
		}

		return nums;
	}

}

