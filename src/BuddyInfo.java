
public class BuddyInfo 
{
	private String name, address, phoneNumber;
	
	public static void main(String args[])
	{
		System.out.println("AddressBook");
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
