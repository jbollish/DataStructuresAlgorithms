import java.util.InputMismatchException;


/**
A class for demo for testing a reverse array class
@author Joseph Bollish
*/
public class RecursionDemo
{
	
	public static void main(String[] args)
	{
		ReverseArray theArray = new ReverseArray();
		dataTypeArray inData = new dataTypeArray();
		final int ARRAY_SIZE = 10;
		int arrList[] = new int[ARRAY_SIZE];
		
		System.out.println("Enter in ten intergers into an array: ");
		
		for(int i = 0; i < arrList.length; i++)
		{
			inData.setData();
			arrList[i] = inData.getData();	
		}
		
		System.out.println("Array list");
		
		for(int i = 0; i < arrList.length; i++)
		{
			System.out.print(arrList[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Array list reverse");
		
		theArray.reverse(arrList, 0, arrList.length-1);
		
		System.out.println();

	}// end main
}// end RecursionDemo
