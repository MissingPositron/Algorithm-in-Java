package Sorts;

import static Sorts.SortUtils.print;

/**
 * 
 * @author Galileo (https://github.com/MissingPositron)
 *
 * @see SortAlgorithm
 */
public class SelectionSort implements SortAlgorithm{

	/**
	 * This method implements the Generic Selection Sort
	 * 
	 * @param unsorted The array to be sorted
	 * Sorts teh array in increasing order
	 */
	@Override
	public <T extends Comparable<T>> T[] sort(T[] unsorted) {
		int n = unsorted.length;
		for (int i = 0; i < n - 1; i++) {
			// Initial index of min
			int min = i;
			
			for (int j = i + 1; j < n; j++) {
				if (SortUtils.less(unsorted[i], unsorted[j])) {
					min = j;
				}
			}
			
			// Swapping if index of min is changed
			if (min != i) {
				SortUtils.swap(unsorted, i, min);
			}
		}
		
		return unsorted;
	}
	
	// Driver Program
	public static void main(String[] args) {
		
		//Integer Input
		Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(integers);
		
		// Output => 231, 78, 54, 23, 12, 9, 6, 4, 1
		print(integers);
		
		// String Input
		String[] strings = {"c", "a", "b", "e", "d"};
		//Output => e, d, c, b, a
		print(selectionSort.sort(strings));
	}

	
}
