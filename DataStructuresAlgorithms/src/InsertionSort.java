/**
A class that uses insertion sort
@author Joseph Bollish
*/
public class InsertionSort 
{
	/**
	 * method to sort in ascending order
	 * @param a an array to sort
	 * @param first index of the first term
	 * @param last index of the last term
	 */
	public void selectionSortAscending(int[] a, int first, int last) 
	{
		for(int unsorted = first + 1; unsorted < a.length; unsorted++)
		{
			int nextToInsert = a[unsorted];
			insertInAscendingOrder(nextToInsert, a , first, unsorted-1);	
		}// end loop
	}// end selectionSortAscending
	
	/**
	 * method to insert elements in order of least to greatest
	 * @param anEntry a number to sort
	 * @param a an array
	 * @param begin index of the first term
	 * @param end index of the last term
	 */
	private  void insertInAscendingOrder(int anEntry, int[]  a, int begin, int end)
	{
		int index = end;
		while((index >= begin) && (anEntry < a[index])) 
		{
			a[index + 1] = a[index];
			index--;
		}// end loop
		a[index + 1] = anEntry;
	}// end insertInAscendingOrder
	
	/**
	 * method to sort in descending order
	 * @param a an array to sort
	 * @param first index of the first term
	 * @param last index of the last term
	 */
	public void selectionSortDescending(int[] a, int first, int last) 
	{
		for(int unsorted = first + 1; unsorted < a.length; unsorted++)
		{
			int nextToInsert = a[unsorted];
			insertInDescendingOrder(nextToInsert, a , first, unsorted-1);	
		}// end loop
	}// end selectionSortDescending

	/**
	 * method to insert elements in order of greatest to least
	 * @param anEntry a number to sort
	 * @param a an array
	 * @param begin index of the first term
	 * @param end index of the last term
	 */
	private  void insertInDescendingOrder(int anEntry, int[]  a, int begin, int end)
	{
		int index = end;
		while((index >= begin) && (anEntry > a[index])) 
		{
			a[index + 1] = a[index];
			index--;
		}// end loop
		a[index + 1] = anEntry;	
	}// end insertInDescendingOrder
}
