import java.util.Scanner;
/**
A class for the data types
@author Joseph Bollish
*/
public class DataType 
{
	private int data;
	
	public DataType() 
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
				if(aData < 0  || aData > 9) 
				{
					System.out.println("Please enter a number between 0 and 9");
				}
				else
				{
					this.data = aData;
					break;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter a valid whole number");
			}// end try-catch
		}// end while
	}// end setData
	
	public String toString() 
	{
		return String.valueOf(data); 	
	}// end toString
}// end DataType
