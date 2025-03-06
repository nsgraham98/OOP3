package exercise3;

public class QuickSort
{
	public static void quickSort(Integer[] nums, int start, int end)
	{	
		if (end <= start) return; //base case
		
		int pivot = partition(nums, start, end);
		quickSort(nums, start, pivot - 1); //sort left side
		quickSort(nums, pivot + 1, end); // sort right side
	}
	
	private static int partition(Integer[] nums, int start, int end)
	{	
		//median of 3
		int mid = start + (end - start) / 2;
		
		if (nums[start] == nums[end] && nums[start] == nums[mid]) {} // base case
		else if (nums[start] < nums[end] && nums[start] > nums[mid])
		{
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp; 
		}
		else if (nums[mid] < nums[end] && nums[mid] > nums[start])
		{
			int temp = nums[end];
			nums[end] = nums[mid];
			nums[mid] = temp;
		}
		else {}
		
		int pivot = nums[end];
		int i = start - 1; //-1
		
		for (int j = start; j <= end - 1; j++)
		{
			if (nums[j] > pivot)
			{
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
		i++;
		int temp = nums[i];
		nums[i] = nums[end];
		nums[end] = temp;
		
		return i;
	}
}
