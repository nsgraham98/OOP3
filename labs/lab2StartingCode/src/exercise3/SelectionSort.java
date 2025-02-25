package exercise3;

public class SelectionSort
{
	public static Integer[] selectionSort(Integer[] nums)
	{
		int i, j;
		int n = nums.length - 1;
		
		for (i = 0; i < n; i++)
		{
			int largestVal = nums[i];
			int largestIndex = i;
			
			for (j = i + 1; j <= n; j++)
			{
				if (nums[j] > largestVal)
				{
					largestVal = nums[j];
					largestIndex = j;
				}
			}		
			nums[largestIndex] = nums[i];
			nums[i] = largestVal;
		}
		
		return nums;
	}
}
