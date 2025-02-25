package exercise2;

public class BinarySearch
{
	public static int binarySearch(Integer[] nums, int target)
	{
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high)
		{
			int i = low + (high - low) / 2;
			
			if (nums[i] > target)
			{
				high = i - 1;
			}
			else if (nums[i] < target)
			{
				low = i + 1;
			}
			else
			{
				return i;
			}
		}
		return -1;
	}
}
