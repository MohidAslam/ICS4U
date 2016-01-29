package Sorts;
/**
 * This class uses merge sort to sort an unsorted array in ascending order.
 * Procedure of merger sort:
 * 1. List is divided into pairs(if there is odd number of elements, the last one is paired with null)
 * 2. the pairs are sorted
 * 3. Start comparing the first element from each of the pairs
 * 4. Start to place the integers back in the array in the correct place.
 * 
 * @author Harkirat Khurana
 *
 */
public class MergeSort2 {

/**
 * 	The main method contains the initial array of integers.
 * First, the unsorted version of the array is printed.
 * The quickSort method is called.
 * Finally the sorted version of the array is printed.
 * @param args runs the main method
 */
	public static void main(String[] args) {
		int []nums = {5,9,8,3,1,7,4,55,66,10,65,22};
		
		printArray(nums);
		sort(nums);
		System.out.println();
		printArray(nums);
	}
	/**
	 * In this method, a temporary array is created and the mergeSort method is run
	 * @param nums the initial array of unsorted integers
	 */
	public static void sort(int[] nums){
		int []tempArray = new int[nums.length];
		mergeSort(tempArray,0,nums.length-1, nums);
	}
	
	/**
	 * 
	 * @param tempArray Temporary array with the same length as the initial array with the unsorted integers
	 * @param lowerIndex 0
	 * @param upperIndex (length of the nums array)-1
	 * @param nums  initial array with the unsorted integers
	 */
	public static void mergeSort(int []tempArray,int lowerIndex,int upperIndex, int[] nums){
		if(lowerIndex == upperIndex)
		{
			return;
		}
		else
		{
			int mid = (lowerIndex+upperIndex)/2;
			mergeSort(tempArray, lowerIndex, mid, nums);
			mergeSort(tempArray, mid+1, upperIndex, nums);
			merge(tempArray,lowerIndex,mid+1,upperIndex, nums);
		}
	}
	/**
	 * 
	 * @param tempArray Temporary array made to store the integers while sorting
	 * @param lowerIndexCursor middle of the chosen array part 
	 * @param higerIndex  end of the chosen array part 
	 * @param upperIndex beginning of the chosen array part 
	 * @param nums
	 */
	public static void merge(int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex, int[] nums){
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higerIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
		while(lowerIndex <= midIndex && higerIndex <= upperIndex)
		{
			if(nums[lowerIndex] < nums[higerIndex])
			{
				tempArray[tempIndex++] = nums[lowerIndex++];
			}
			else
			{
				tempArray[tempIndex++] = nums[higerIndex++];
			}
		}
		
		while(lowerIndex <= midIndex)
		{
			tempArray[tempIndex++] = nums[lowerIndex++];
		}
		
		while(higerIndex <= upperIndex)
		{
			tempArray[tempIndex++] = nums[higerIndex++];
		}
		
		for(int i=0;i<totalItems;i++)
		{
			nums[lowerIndexCursor+i] = tempArray[i];
		}
	}
	/**
	 * Prints the array
	 * @param nums array of integers to be printed, sorted and unsorted
	 */
	public static void printArray(int []nums){
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
	
	

}
