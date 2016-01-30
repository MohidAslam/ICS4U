package mySorting;

/** 
 * @author Mohid Aslam
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] nums = {20,51,1,32,7,1,87,99,234,44};
		int low = 0;
		int high = nums.length - 1;

		for(int i = 0; i < high; i++)
		{
			if(i != high-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}
		quickSort(nums, low, high);
		System.out.println("");
		for(int i = 0; i < high; i++)
		{
			if(i != high-1)
				System.out.print(nums[i] + ", ");
			else
				System.out.print(nums[i]);
		}
	}
	public static void quickSort(int[] nums, int low, int high) 
	{
		if (nums == null || nums.length == 0)
		{
			return;
		}
		if (low >= high)
		{
			return;
		}
		int mid = low + (high - low) / 2;
		int pivot = nums[mid];
		int i = low, j = high;
		while (i <= j)
		{
			while (nums[i] < pivot) 
			{
				i++;
			}
			while (nums[j] > pivot) 
			{
				j--;
			}
			if (i <= j) 
			{
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
		{
			quickSort(nums, low, j);
		}

		if (high > i)
		{
			quickSort(nums, i, high);
		}
	}
}
