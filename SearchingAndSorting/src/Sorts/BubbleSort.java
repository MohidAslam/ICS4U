package Sorts;
/**
 * This class is used to sort through an array of integers using bubble sort.
 * In bubble sort, 2 elements are selected a time and compared. In this class, the lower integer 
 * is placed on the left side and the greater on the right side, since the array is being arranged 
 * in an ascending order. 
 * 
 * So,
 * 
 * 
 * @author Harkirat Khurana
 *
 */
public class BubbleSort {
/**
 * The main method contains the initial array of integers.
 * First, the unsorted version of the array is printed.
 * The bubbleSort method is called.
 * Finally the sorted version of the array is printed.
 * 
 * @param args run of the beginnig of the calss
 */
	public static void main(String[] args) {

		int[] nums = {5,9,8,3,1,5,7,4,55,66,10,65};


		System.out.print("{");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}
		System.out.print("}");
		
		bubbleSort(nums);
		
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
	 * In this method, one element is compared to the next one, if the value of the integer
	 * on the right side is less than the value of the integer on the left side, the 2 integers are 
	 * swapped. The nested for loops makes sure to go through every element.
	 * 
	 * @param nums An array containing the unsorted integers
	 * @return sorted integers in the nums array in ascending order
	 */
	public static int[] bubbleSort(int[] nums)
	{
		// helps with swapping
		int temp;
		
		//nested loops to compare one of the elements to the next element all the way to the end.
		for(int j = 0; j < nums.length-1; j++)
		{
			for(int i = 0; i < nums.length-1; i++)
			{
				//setting comparators
				int first = nums[i];
				int second = nums[i+1];
				
				//swapping
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
