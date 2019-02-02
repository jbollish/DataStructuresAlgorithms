/**
A class ADT Queue
@author Joseph Bollish
*/
public final class ArrayQueue<T> implements QueueInterface<T>
{
	 private T[] queue; // Circular array of queue entries and one unused location
	 private int frontIndex;
	 private int backIndex;
	 private boolean initialized = false;
	 private static final int DEFAULT_CAPACITY = 5;
	 private static final int MAX_CAPACITY = 10;
	   
	public ArrayQueue()
	{
	      this(DEFAULT_CAPACITY);
	} // end default constructor
	   
	public ArrayQueue(int initialCapacity)
	{
	     checkCapacity(initialCapacity);
	      
	     // The cast is safe because the new array contains null entries
	     @SuppressWarnings("unchecked")
	     T[] tempQueue = (T[]) new Object[initialCapacity + 1];
	     queue = tempQueue;
	     frontIndex = 0;
	     backIndex = initialCapacity;
	     initialized = true;
	} // end constructor

	private void checkCapacity(int initialCapacity) {
		   if (initialCapacity > MAX_CAPACITY)
		         throw new IllegalStateException("Attempt to create a queue " +
		                                         "whose capacity exceeds " +
		                                         "allowed maximum.");
		   } // end checkCapacity

	@Override
	  /** Adds a new entry to the back of this queue.
    @param newEntry  An object to be added. */
	public void enqueue(T newEntry) 
	{
		checkInitialization();
		   backIndex = (backIndex + 1) % queue.length;
		   queue[backIndex] = newEntry;
	} // end enqueue

	private void checkInitialization()
	{
		 if (!initialized)
	         throw new SecurityException ("ArrayQueue object is not initialized properly.");
	 } // end checkInitialization

	@Override
	  /** Removes and returns the entry at the front of this queue.
    @return  The object at the front of the queue. 
    @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue() 
	{
		checkInitialization();
		   if (isEmpty())
		      throw new EmptyQueueException();
		   else
		   {
		      T front = queue[frontIndex];
		      queue[frontIndex] = null;
		      frontIndex = (frontIndex + 1) % queue.length;
		      return front;
		   } // end if
	} // end dequeue

	@Override
	  /**  Retrieves the entry at the front of this queue.
    @return  The object at the front of the queue.
    @throws  EmptyQueueException if the queue is empty. */
	public T getFront() 
	{
		checkInitialization();
		   if (isEmpty())
		      throw new EmptyQueueException();
		   else
		      return queue[frontIndex];
	} // end getFront

	@Override
	  /** Detects whether this queue is empty.
    @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty() 
	{
		 return frontIndex == ((backIndex + 1) % queue.length);
	} // end isEmpty

	@Override
	  /** Removes all entries from this queue. */
	public void clear() 
	{
		while (!isEmpty())
		{
			dequeue();
		} // end while
	} // end clear
}
