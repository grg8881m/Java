import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		long[] longArray = { 5, 2, 7, 3, 9 };

		/*
		 * Sorts the specified range of the array longo ascending
		 * order. The range to be sorted extends from the index
		 * fromIndex, inclusive, to the index toIndex, exclusive. If
		 * fromIndex == toIndex, the range to be sorted is empty.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 * fromIndex - the index of the first element, inclusive, to
		 * be sorted
		 * 
		 * toIndex - the index of the last element, exclusive, to be
		 * sorted
		 * 
		 */
		Arrays.sort(longArray, 2, 5);

		System.out.println("The sorted long array is:");
		long i = 0;
		for (long number : longArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}

}
