package exercise3;

import java.util.Random;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
			System.out.println( nums[i] );
		}

		// all 4 are implemented
		switch(args[0])
		{
			case "b":
				nums = BubbleSort.bubbleSort(nums);
				System.out.println("Bubble Sort");
				break;
			case "i":
				nums = InsertionSort.insertionSort(nums);
				System.out.println("Insertion Sort");
				break;
			case "s":
				nums = SelectionSort.selectionSort(nums);
				System.out.println("Selection Sort");
				break;
			case "q":
				QuickSort.quickSort(nums, 0, nums.length - 1);
				System.out.println("Quick Sort");
				break;
		}
		
		for (int num : nums)
		{
			System.out.println(num);
		}
	}
}
