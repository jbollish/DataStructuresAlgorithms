
public class ArrayQuickSort 
{

	/** Sorts an array into ascending order. Uses quick sort with
    median-of-three pivot selection for arrays of at least 
    "a" entries, and uses insertion sort for other arrays. */
	public static <T extends Comparable<T>> void quickSort(T[] a, int first, int last)
	{
		
	   if (last - first + 1 < a.length-1)
	    {
	       insertionSort(a, first, last);
	    }
	    else
	    {
	       // Create the partition: Smaller | Pivot | Larger
	       int pivotIndex = partition(a, first, last);
	
	       // Sort sub arrays Smaller and Larger
	       quickSort(a, first, pivotIndex - 1);
	       quickSort(a, pivotIndex + 1, last);
	    } // end if
	} // end quickSort
	private static <T extends Comparable<T>> int partition(T[] a, int first, int last)
	{
		  T x = a[last];

	         int i = first-1;
	          T temp;

	         for(int j= first; j< last; j++)
	         {
	             if(0 >= a[j].comparTo(x))
	             {
	                 i++;
	                 temp = a[i];
	                 a[i] = a[j];
	                 a[j] = temp;
	             }
	         }

	         temp = a[i+1];
	         a[i+1] = a[last];
	         a[last] = temp;
	         return (i+1);
	
	}
	public static <T extends Comparable<T>> void insertionSort(T[] a, int first, int last)
	{
		if (first < last)
		{
		// Sort all but the last entry
		insertionSort(a, first, last - 1);
		
		// Insert the last entry in sorted order
		insertInOrder(a[last], a, first, last - 1); 
		} // end if
	} // end insertionSort
	
	private static <T extends Comparable<T>> void insertInOrder( T a, T[] a2, int begin, int end)
	{
		int index = end;
		while((index >= begin) && (0 > a.comparTo(a2[index]))) 
		{
			a2[index + 1] = a2[index];
			index--;
		}// end loop
		a2[index + 1] = a;
	}// end insertInOrder

	  public static void qsort(int[] arr, int a, int b) 
	  {
	        if (a < b) {
	            int i = a, j = b;
	            int x = arr[(i + j) / 2];

	            do {
	                while (arr[i] > x ) i++;
	                while (x > arr[j] ) j--;

	                if ( i <= j) {
	                    int tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	                    i++;
	                    j--;
	                }

	            } while (i <= j);

	            qsort(arr, a, j);
	            qsort(arr, i, b);
	        }
	    }
	  
	  public static void qsort(String[] arr, int a, int b) 
	  {
	        if (a < b) {
	            int i = a, j = b;
	            String x = arr[(i + j) / 2];

	            do {
	                while ( 0 < arr[i].compareTo(x)) i++;
	                while (0 < x.compareTo(arr[j]) ) j--;

	                if ( i <= j) {
	                    String tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	                    i++;
	                    j--;
	                }

	            } while (i <= j);

	            qsort(arr, a, j);
	            qsort(arr, i, b);
	        }
	    }

}
