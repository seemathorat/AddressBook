public class AddressBookMain{

 String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String phoneNumber;

   AddressBookMain(String firstName, String lastName, String address, String city, String state, int zipCode,String phoneNumber)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;
      this.phoneNumber = phoneNumber;
   }

public static void main(String[] args)
		{
			AddressBookMain ab = new AddressBookMain("Seema","Thorat","Mumbai","Manchr","Maharastra",415605,"9503076240");
		}
	}
