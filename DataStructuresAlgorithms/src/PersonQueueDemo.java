import java.util.ArrayList;
import java.util.Collections;
/**
A class demo for printing five names and ages by descending order.
@author Joseph Bollish
*/
public class PersonQueueDemo 
{
	/**
	 * method for adding to the queue
	 * @param inQueue the ADT Queue
	 */
	public static void addToQueue(QueueInterface<Person> inQueue) 
	{
		Person people = new Person();
		System.out.println("Enter five names (first and last) and age: ");
		for(int i = 0; i < 5 ; i++) 
		{
			System.out.println();
			people.setFirstName();
			people.setLastName();
			people.setAge();
			inQueue.enqueue(new Person(people.getFirstName(),people.getLastName(),people.getAge()));
		}
	}
	
	public static void main(String[] args) 
	{
		QueueInterface<Person> theQueue = new ArrayQueue<>();
		ArrayList<Person> ap = new ArrayList<Person>();
		
		addToQueue(theQueue); // adding to queue
		
		System.out.println();
		System.out.println("Contents of queue:");
		System.out.println();
		
		// print contents of queue and adds queue to an ArrayList
		for(int i = 0; i < 5 ; i++) 
		{
			System.out.println(theQueue.getFront());
			ap.add(theQueue.dequeue());
		}
		
		System.out.println();
		System.out.println("Desending order by last name:");
		System.out.println();
		
		// sorting by last name
		Collections.sort(ap, new sortByLastName());
		for(int i = 0; i < 5; i++) 
		{
			System.out.println(ap.get(i));
		}
		
		System.out.println();
		System.out.println("Desending order by age:");
		System.out.println();
		
		// sorting by age
		Collections.sort(ap, new sortByAge());
		for(int i = 0; i < 5; i++) 
		{
			System.out.println(ap.get(i));
		}	
	}
}	

