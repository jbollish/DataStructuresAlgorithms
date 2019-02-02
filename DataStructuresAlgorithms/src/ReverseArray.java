/**
A class for reversing an array
@author Joseph Bollish
*/
public class ReverseArray 
{
	/**
	 * Method to reverse an array
	 * @param arrList the array to reverse
	 * @param first index 0
	 * @param last index last
	 */
	public void reverse(int[] arrList, int first, int last) 
	{
		System.out.print(arrList[last] + " ");
		
		if(first < last) 
		{
			reverse(arrList,first, last-1);
		}
	}// end reverse
}// end ReversArray
