package exercise3;

public class BubbleSort
{
	public static Integer[] bubbleSort(Integer[] nums)
	{
		int i, j;
		int n = nums.length - 1;
		boolean swapped;
		
		for (i = 0; i < n; i++)
		{
			swapped = false;
			
			for (j = 0; j < n - i; j++)
			{
				if (nums[j] < nums[j + 1])
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swapped = true;
				}
			}	
			if (!swapped)
			{
				break;
			}
		}
		return nums;
	}
}
