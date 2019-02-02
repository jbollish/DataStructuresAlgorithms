import java.util.Scanner;
/**
A class for the data type
@author Joseph Bollish
*/
public class dataTypeArray 
{
	private int data;
	
	public dataTypeArray() 
	{
		data = 0;
	}

	public int getData() 
	{
		return data;
	}

	public void setData(int data)
	{
		this.data = data;
	}
	
	public void setData() 
	{
		Scanner in = new Scanner(System.in);
		int aData = 0;
		while(true) 
		{
			try 
			{
				System.out.println("Enter value: ");
				String theData = in.next();
				aData = Integer.parseInt(theData);
				this.data = aData;
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter a valid integer");
			}// end try-catch
		}// end while
	}// end setData
}// end dataTypeArray
