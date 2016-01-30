package mySorting;
/**
 * 
 * @author Mohid Aslam
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = {20,51,1,32,7,1,87,99,234,44};

		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");
			else
				System.out.print(nums[i]);
		}
		bubbleSort(nums);
		
		System.out.println("");
		System.out.println("");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");
			else
				System.out.print(nums[i]);
		}
	}
	public static int[] bubbleSort(int[] nums)
	{
		int temp;
		
		for(int j = 0; j < nums.length-1; j++)
		{
			for(int i = 0; i < nums.length-1; i++)
			{
				int first = nums[i];
				int second = nums[i+1];
				
				if(nums[i] > nums[i+1])
				{
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
			}
		}
		return nums;
	}
}
