package mySorting;

/**
 * @author Mohid Aslam
 *
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] nums = {20,51,1,32,7,1,87,99,234,44};
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");
			else
				System.out.print(nums[i]);
		}
		selectionSort(nums);
		System.out.println("");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");
			else
				System.out.print(nums[i]);
		}
		System.out.print("");
	}
	public static int[] selectionSort(int[] nums)
	{
		return nums;
	}
}

