package exercise3;

public class InsertionSort
{
	public static Integer[] insertionSort(Integer[] nums)
	{
		int i, j;
		
		for (i = 0; i <= nums.length - 1; i++)
		{
			j = i;
			while (j > 0 && nums[j] > nums[j-1])
			{
				int temp = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = temp;
				j--;
			}
		}		
		return nums;
	}
}
