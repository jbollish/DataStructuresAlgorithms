import java.util.Comparator;
import java.util.Scanner;
/**
A class for the data types first name, last name, and age.
Sorting by last name and age
@author Joseph Bollish
*/
public class Person 
{
	private String firstName;
	private String lastName;
	private String age;
	
	public Person()
	{
		this("","","");
	}

	public Person(String firstName, String lastName, String age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public void setFirstName()
	{
		Scanner in = new Scanner(System.in);
		String fname = "";
		boolean done = false;
		while(!done) 
		{
			System.out.println("Enter first name: ");
			fname = in.nextLine();
			if(fname.length()< 1)
			{
				System.out.println("Enter a first name that is at least 1 character");
			}
			else 
			{
				this.firstName = fname;
				done = true;
			}
		}// end while
	}// end setFirstName
	

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setLastName()
	{
		Scanner in = new Scanner(System.in);
		String lname = "";
		boolean done = false;
		while(!done) 
		{
			System.out.println("Enter last name: ");
			lname = in.nextLine();
			if(lname.length()< 1)
			{
				System.out.println("Enter a last name that is at least 1 character");
			}
			else 
			{
				this.lastName = lname;
				done = true;
			}
		}// end while
	}// end setLastName

	public String getAge() 
	{
		return age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}
	
	public void setAge() 
	{
		Scanner in = new Scanner(System.in);
		int aAge = 0;
		while(true) 
		{
			try 
			{
				System.out.println("Enter age: ");
				String theAge = in.next();
				aAge = Integer.parseInt(theAge);
				if(aAge < 0  || aAge > 100) 
				{
					System.out.println("Please enter a number between 0 and 100");
				}
				else
				{
					this.age = String.valueOf(aAge);
					break;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter a valid whole number");
			}// end try-catch
		}// end while
	}// end setAge
	
	public String toString()
	{
		return firstName + " " + lastName + " " + age;
	}
}

/**
A class to sort last names in descending order
@author Joseph Bollish
*/
class sortByLastName implements Comparator<Person>
{

	@Override
	public int compare(Person a, Person b)
	{
		
		int result = b.getLastName().compareTo(a.getLastName());
		
		if(result == 0) 
		{
			result = b.getFirstName().compareTo(a.getFirstName());	
			if(result == 0)
			{
				result = b.getAge().compareTo(a.getAge());
			}
		}
		return result;
	}// end compare
}// end sortByName

/**
A class to sort ages in descending order
@author Joseph Bollish
*/
class sortByAge implements Comparator<Person>
{

	@Override
	public int compare(Person a, Person b) 
	{
		int result = b.getAge().compareTo(a.getAge());
		
		if(result == 0) 
		{
			result = b.getLastName().compareTo(a.getLastName());	
			if(result == 0)
			{
				result = b.getFirstName().compareTo(a.getFirstName());
			}
		}
		return result;
	}// end compare
}// end sortByAge