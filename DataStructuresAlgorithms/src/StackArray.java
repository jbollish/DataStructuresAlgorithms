import java.util.EmptyStackException;
/**
    A class of stacks whose entries are stored in an array.
*/
public class StackArray<T> implements StackInterface<T>
{
	private T[] stack;    // Array of stack entries
	private int topIndex; // Index of top entry
   private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
  
   public StackArray()
   {
      this(DEFAULT_CAPACITY);
   } // end default constructor
  
   public StackArray(int initialCapacity)
   {
	   if(initialCapacity <= MAX_CAPACITY)
		{   
	      // The cast is safe because the new array contains null entries
	      @SuppressWarnings("unchecked")
	      T[] tempStack = (T[])new Object[initialCapacity];
	      stack = tempStack;
	      topIndex = -1;
	      initialized = true;
		}
	   else 
		   throw new IllegalStateException("Attempt to create a bag " +
                  "whose capacity exceeds " +
                  "allowed maximum.");
   }

	@Override
	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) 
	{
		checkInitialization();
		stack[topIndex + 1] = newEntry;
		topIndex++;
	} // end push
	
	@Override
	/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. 
    @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop()
	{
	   checkInitialization();
	   if (isEmpty())
	      throw new EmptyStackException();
	   else
	   {
	      T top = stack[topIndex];
	      stack[topIndex] = null;
	      topIndex--;
	      return top;
	   } // end if
	} // end pop

	@Override
	/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.
    @throws  EmptyStackException if the stack is empty. */
	public T peek()
	{
	   checkInitialization();
	   if (isEmpty())
	      throw new EmptyStackException();
	   else
	      return stack[topIndex];
	} // end peek
	
	@Override
	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
	public boolean isEmpty() 
	{
		return topIndex < 0;
	}
	
	@Override
	/** Removes all entries from this stack. */
	public void clear() 
	{
		while(!isEmpty()) {
			pop();
		}// end while
	} // end clear
	
	private void checkInitialization()
	{
	    if (!initialized)
	    	throw new SecurityException("ArrayBag object is not initialized properly.");
	} // end checkInitialization
} // end StackArray
