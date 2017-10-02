import java.util.ArrayList;
//Sample Comment
public class AddressBook 
{
	private ArrayList<BuddyInfo> book;

	public static void main(String args[])
	{
		BuddyInfo buddy = new BuddyInfo("Todd", "1 Colonel By Drive", "123 456 789");
		AddressBook book = new AddressBook();
		book.addBuddy(buddy);
		System.out.println(book.toString());
		book.removeBuddy(buddy);
		
	}
	
	public AddressBook() {
		book = new ArrayList<BuddyInfo>();
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
	}
	
	public void removeBuddy(BuddyInfo buddy)
	{
		if(!book.remove(buddy))
		{
			System.out.println("Buddy not found.");
		}
		
	}
	
	public void removeBuddy(int index)
	{
		if(index > book.size() - 1 || index < 0)
		{
			System.out.println("Index out of range.");		
		}
		else
		{
			book.remove(index);
		}
		
	}
	
	public String toString()
	{
		String s = "ADDRESS BOOK - Contains " + book.size() + " buddies\n";
		for(BuddyInfo buddy: book)
		{
			s += "Name: " + buddy.getName();
			s += " Address: " + buddy.getAddress();
			s += " Phone Number: " + buddy.getPhoneNumber() + "\n";
			
		}
		return s;
	}
}
