/**
A class for runtime exception 
@author Joseph Bollish
*/
@SuppressWarnings("serial")
public class EmptyQueueException extends RuntimeException 
{

	public EmptyQueueException() 
	{
		this (null); 
	}// end default constructor
	
	public EmptyQueueException(String message)
	{ 
		super (message);
	}// end constructor
}// end EmptyQueueException