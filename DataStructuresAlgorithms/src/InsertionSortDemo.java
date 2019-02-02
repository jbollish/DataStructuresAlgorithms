/**
Project Name: CSC400-CTA06
A class demo for insertion sort (exercise #2)
@author Joseph Bollish
*/
public class InsertionSortDemo
{

	public static void main(String[] args)
	{
		dataTypeArray inData = new dataTypeArray();
		InsertionSort sort = new InsertionSort();
		final int ARRAY_SIZE = 8;
		int arrList[] = new int[ARRAY_SIZE];
		
		System.out.println("Enter in eight integers into an array: ");
		
		// input to array
		for(int i = 0; i < arrList.length; i++)
		{
			inData.setData();
			arrList[i] = inData.getData();	
		}// end for loop
		
		// print original array
		System.out.println("Array list entered:");
		for(int i = 0; i < arrList.length; i++)
		{
			System.out.print(arrList[i] + " ");
		}// end for loop
		
		// sort array ascending order
		sort.selectionSortAscending(arrList, 0 , arrList.length-1);
		System.out.println();
		System.out.println("Sorted in ascending order: ");
		
		for(int i = 0; i < arrList.length; i++)
		{
			System.out.print(arrList[i] + " ");
		}// end for loop
		
		// sort array in descending order
		sort.selectionSortDescending(arrList, 0 , arrList.length-1);
		System.out.println();
		System.out.println("Sorted in descending order: ");
		
		for(int i = 0; i < arrList.length; i++)
		{
			System.out.print(arrList[i] + " ");
		}// end for loop
	}// end main
}// end InsertionSortDemo
