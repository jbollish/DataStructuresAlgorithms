/**
A class that implements a bag of objects by using an array.
@author Joseph Bollish
*/
public class ClothingBag <MyType> implements BagInterface<MyType>
{
	private final MyType [] myBag;
	private int numberofProducts;
	private boolean initialized = false;
	private static final int Default_Capacity = 5;
	private static final int MAX_CAPACITY = 10000;
	
	
	/** Creates an empty bag whose initial capacity is 30. */
	public ClothingBag() 
	{
		this(Default_Capacity);
	}// end default constructor
	
	/** Creates an empty bag having a given capacity.
    @param capacity  The integer capacity desired. */
	public ClothingBag(int capacity)
	{
		if(capacity <= MAX_CAPACITY)
		{
			// The cast is safe because the new array contains null entries
			@SuppressWarnings("unchecked")
			MyType[] aBag = (MyType[])new Object[capacity]; // Unchecked cast
			myBag = aBag;
			numberofProducts = 0;
			initialized = true;
		}
		else 
			   throw new IllegalStateException("Attempt to create a bag " +
                       "whose capacity exceeds " +
                       "allowed maximum.");
		
		
	} // end constructor
	
	@Override
	/** Adds a new entry to this bag.
    @param newEntry  The object to be added as a new entry.
    @return  True if the addition is successful, or false if not. */
	public boolean add(MyType newEntry)
	{
		checkInitialization();
		boolean result = true;
		if(isFull())
		{
			result = false;	
		}
		else 
		{
			myBag[numberofProducts]= newEntry;
			numberofProducts++	;
		}//end if
		return result;
	}// end add
	
	// Returns true if the array bag is full, or false if not
	private boolean isFull()
	{
		return numberofProducts >= myBag.length;
	} // end isFull
	
	@Override
	/** Retrieves all entries that are in this bag.
	 @return  A newly allocated array of all the entries in the bag.*/
	public MyType[] toArray() 
	{
		// The cast is safe because the new array contains null entries
		@SuppressWarnings("unchecked")
		MyType[] result = (MyType[])new Object[numberofProducts];
		for(int index = 0 ; index < numberofProducts; index++)
		{
			result[index] = myBag[index];
		}
	return result;
	} // end toArray
	
	// Throws an exception if this object is not initialized.
	private void checkInitialization()
	{
		if (!initialized)
			throw new SecurityException("ArrayBag object is not initialized properly.");
	} // end checkInitialization
} // end ClothingBag
