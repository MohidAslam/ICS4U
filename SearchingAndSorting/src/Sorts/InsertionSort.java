package Sorts;
/**
 * This class takes an array of unsorted integers and then uses selsction sort to sort
 * the integers in ascending order. When sorted, the new sorted array is printed.
 * In insertion sort, a list is divided into 2 portions, one sorted and the other unsorted.
 * In every step portion of the procedure, an element is moved from the unsorted portion
 * to the sorted one, and the element is "inserted" in the correct position. 
 * 
 * @author Harkirat Khurana
 *
 */
public class InsertionSort {


/**
 * The main method contains the initial array of integers.
 * First, the unsorted version of the array is printed.
 * The insertionSort method is called.
 * Finally the sorted version of the array is printed.
 * 
 * @param args runs the main method
 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] nums = {98,51,2,6,7,0,44,35,71,25,89};
		System.out.print("{");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");

			else
				System.out.print(nums[i]);
		}
		System.out.print("}");

		insertionSort(nums);

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
	 * This method gets an array of unsorted integers and uses insertion sort to re-arrange
	 * the integers in ascending order. 
	 * Insertion sort basically acts like there are 2 parts in the same list. In this method
	 * there is one side which is sorted and the other which is not.
	 * One by one, an element is chosen from the unsorted side and is moved and placed in 
	 * the correct position in the sorted side.
	 * This is repeated until there are not integers in the unsorted side.
	 * 
	 * @param nums the array of integers which need to be sorted.
	 */
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

			//printArray(nums);

		}
	}

	/*public static void printArray(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
	}
	 */

}
