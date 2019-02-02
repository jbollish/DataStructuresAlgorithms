import java.util.Scanner;
/**
Project Name: CSC400-CTA02
Class BoutiqueBagDemo tests the bag implementation
@author Joseph Bollish
*/
public class BoutiqueBagDemo
{
	// adds product MyType to bag
	private static void testAddl(BagInterface<MyType> aBag) 
	{
		MyType bag = new MyType();
		bag.setDescription();
		bag.setPrice();
		if(aBag.add(bag))
		{	
			System.out.println(bag.toString() + " has been added to the bag.\n");
		}
		else 
		{
			System.out.println("Bag full, " + bag.toString() + " cannot be added to the bag.\n");
		}
	} // end testAdd1
	
	// shows contents of bag
	private static void displayBag(BagInterface<MyType> aBag)
	{
		Object[] bagArray = aBag.toArray();
		for(int index = 0 ; index < bagArray.length; index++ ) 
		{
			System.out.print(bagArray[index] + "\n");
		}
	} // end displayBag
	
	public static void main(String[] args)
	{
		System.out.println("CSC400-CTA02-Opt01");
		System.out.println("Clothing Boutique");
		System.out.println("Enter \"Add\" to add product to bag.");
		System.out.println("Enter \"Dis\" to display bag.");
		System.out.println("Enter \"Exit\" to Exit.");
		System.out.println();
		
		BagInterface <MyType> aBag = new ClothingBag<>();
		Scanner scnr = new Scanner(System.in);
		boolean done = true;
		
		
		while(done) 
		{
			System.out.println("Commands");
			System.out.println("Add | Dis | Exit");
			String input = scnr.next().toUpperCase();
			switch(input)
			{
			case "ADD":
				testAddl(aBag); // adds product MyType to bag
				break;
			case "DIS":
				displayBag(aBag); // shows contents of bag
				break;
			case "EXIT":
				System.out.println("Exit clothing boutique program.");
				System.out.println("Goodbye");
				System.exit(0); // exit program
				break;
			default:
				System.out.println("Please enter a valid command.");
			} // end switch
		} // end while
	} // end main
} // end BoutiqueBagDemo
