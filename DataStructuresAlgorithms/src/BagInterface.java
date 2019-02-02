/**
An interface bag
@author Joseph Bollish
*/
public interface BagInterface<T>
{
	/** Adds a new entry to this bag.
	 @param newEntry  The object to be added as a new entry.
	 @return  True if the addition is successful, or false if not. */
	public boolean add(T newEntry);
	
	/** Retrieves all entries that are in this bag.
	 @return  A newly allocated array of all the entries in the bag.
     Note: If the bag is empty, the returned array is empty. */
	public T[] toArray();
} // end BagInterface
