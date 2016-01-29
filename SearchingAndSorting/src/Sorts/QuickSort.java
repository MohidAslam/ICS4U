package Sorts;

/** This class uses quick sort to re-arrange all the integers in an array in ascending order
 * Procedure of quick sort:
 * 	A pivot value is chosen(usually the first value in the array)
 *	Partition the array so that the values larger than the pivot are on the right and the values are smaller on the left, the pivot value should now be in its correct position	
 *	Repeated with the left side of the array
 *
 * 
 * @author Harkirat Khurana
 *
 */
public class QuickSort {
/**
 * The main method contains the initial array of integers.
 * First, the unsorted version of the array is printed.
 * The quickSort method is called.
 * Finally the sorted version of the array is printed.
 * 
 * @param args used to run the main method
 */
	public static void main(String[] args) {
		int[] nums = { 98,51,2,6,7,0,44,35,71,25,89 };

		int low = 0;
		int high = nums.length - 1;

		System.out.print("{");
		for(int i = 0; i < high; i++)
		{
			if(i != high-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}
		System.out.print("}");


		quickSort(nums, low, high);

		System.out.println("");
		System.out.print("TO");
		System.out.println("");

		System.out.print("{");
		for(int i = 0; i < high; i++)
		{
			if(i != high-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}
		System.out.print("}");

	}
/**
 * This method uses quick sort to sort an array of integers to sort them in ascending order
 * 
 * @param nums The initial array of unsorted integers is passed in to b sorted in ascending order
 * @param low value that keep tracks of the index and is compared to "high"
 * @param high  value that keep tracks of the index and is compared to "low"
 */
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

		// picks the pivot for the array
		int mid = low + (high - low) / 2;
		int pivot = nums[mid];

		// make left smaller pivot and right greater pivot
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

		// The 2 sides are recursively sorted
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
