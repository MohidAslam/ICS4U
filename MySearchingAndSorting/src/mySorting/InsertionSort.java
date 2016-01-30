package mySorting;
/**
 * 
 * @author Mohid Aslam
 *
 */
public class InsertionSort {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] nums = {20,51,1,32,7,1,87,99,234,44};		
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}

		insertionSort(nums);

		System.out.println("");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");
			else
				System.out.print(nums[i]);
		}
	}
	public static void insertionSort(int nums[]) 
	{

		for (int j = 1; j < nums.length; j++) 
		{
			int key = nums[j];
			int i = j-1;

			while ( (i > -1) && ( nums [i] > key ) ) 
			{
				nums [i+1] = nums [i];
				i--;
			}
			nums[i+1] = key;
		}
	}
}
