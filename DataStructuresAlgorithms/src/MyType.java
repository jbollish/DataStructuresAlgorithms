import java.text.DecimalFormat;
import java.util.Scanner;
/**
A class for the data types
@author Joseph Bollish
*/
public class MyType 
{
	private String description;
	private double price;
	
	public MyType()
	{
		description = "";
		price = 0.0;
	}
	
	public MyType(String description, double d)
	{
		this.description = description;
		this.price = d;
	}
	
	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setDescription()
	{
		Scanner in = new Scanner(System.in);
		String productDesciption = "";
		boolean done = false;
		while(!done) 
		{
			System.out.println("Enter discription for product: ");
			productDesciption = in.nextLine();
			if(productDesciption.length()< 6)
			{
				System.out.println("Enter a description that is at least 6 characters");
			}
			else 
			{
				this.description = productDesciption;
				done = true;
			}
		}
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	public void setPrice() 
	{
		Scanner in = new Scanner(System.in);
		double aPrice = 0.0;
		while(true) 
		{
			try 
			{
				System.out.println("Enter price for a " + this.getDescription());
				String thePrice = in.next();
				aPrice = Double.parseDouble(thePrice);
				if(aPrice <= 0) 
				{
					System.out.println("Please enter a number greater than $0.00.");
				}
				else
				{
					this.price = aPrice;
					break;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter a valid price");
			}
			
		}
	}
	
	public String toString() 
	{
		DecimalFormat format = new DecimalFormat("##.00");
    	return "A " + description + " for $" + format.format(price);
	} // end toString
}
