
public class BuddyInfo 
{
	private String name, address, phoneNumber;
	
	public static void main(String args[])
	{
		BuddyInfo buddy = new BuddyInfo("Todd", "1 Colonel By Drive", "123 456 789");
		AddressBook book = new AddressBook();
		book.addBuddy(buddy);
		book.removeBuddy(buddy);
	}
	
	public BuddyInfo(String name, String address, String phoneNumber)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
