import java.util.ArrayList;

public class AddressBook 
{
	private ArrayList<BuddyInfo> book;
	private int size;

	public static void main(String args[])
	{
		System.out.println("Address Book");
	}
	
	public AddressBook() {
		book = new ArrayList<BuddyInfo>();
		size = 0;
	}
	
	public ArrayList<BuddyInfo> getBook() {
		return book;
	}

	public void setBook(ArrayList<BuddyInfo> book) {
		this.book = book;
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		book.add(buddy);
		size++;
	}
	
	public void removeBuddy(BuddyInfo buddy)
	{
		if(!book.remove(buddy))
		{
			System.out.println("Buddy not found.");
		}
		else
		{
			size--;
		}
		
	}
	
	public void removeBuddy(int index)
	{
		if(index > size - 1)
		{
			System.out.println("Index out of range.");		
		}
		else
		{
			book.remove(index);
			size--;
		}
		
	}
}
