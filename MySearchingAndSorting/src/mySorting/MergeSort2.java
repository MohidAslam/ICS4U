package mySorting;
/**
 * @author Mohid Aslam
 *
 */
public class MergeSort2 {
	public static void main(String[] args) {
		int[] nums = {20,51,1,32,7,1,87,99,234,44};		
		printArray(nums);
		sort(nums);
		System.out.println();
		printArray(nums);
	}
	public static void sort(int[] nums){
		int []tempArray = new int[nums.length];
		mergeSort(tempArray,0,nums.length-1, nums);
	}
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
	public static void printArray(int []nums){
		System.out.print("{");
		for(int i = 0; i < nums.length; i++)
		{
			if(i != nums.length-1)
				System.out.print(nums[i] + ", ");
			else
				System.out.print(nums[i]);
		}
	}
}
