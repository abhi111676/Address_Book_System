import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditExistingContact {
  
	Scanner scanner = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	List<EditExistingContact> personList = new ArrayList<EditExistingContact>();

	public void add() {
		System.out.println("Enter your first name");
		String firstName = scanner.nextLine();
		System.out.println("Enter your last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter your address");
		String address = scanner.nextLine();
		System.out.println("Enter your city");
		String city = scanner.nextLine();
		System.out.println("Enter your state");
		String state = scanner.nextLine();
		System.out.println("Enter your phone");
		long mobileNo = scanner.nextLong();
		System.out.println("Enter your zip code");
		int zip = scanner.nextInt();

		EditExistingContact person1 = new EditExistingContact(firstName, lastName, address, city, state, mobileNo, zip);
		personList.add(person1);
		System.out.println("Contact added successfully");
	}

	public void display() {
		for (int i = 0; i < personList.size(); i++) {
			EditExistingContact person = personList.get(i);
			System.out.println("FirstName:" + person.getFirstName() + "\n" + "LastName:"
					+ ((Object) person).getLastName() + "\n" + "Adress:" + person.getAddress() + "\n" + "City:"
					+ person.getCity() + "\n" + "State:" + person.getCity() + "Phone-Number:" + person.getMobileNo()
					+ "\n" + "Pin-code:" + person.getPincode());
		}
	}

	public void edit(String firstName) {
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			Scanner scanner = new Scanner(System.in);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
			String address = scanner.nextLine();
			person.setAddress(address);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
			String city = scanner.nextLine();
			person.setCity(city);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
			String state = scanner.nextLine();
			person.setState(state);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
			int zip = scanner.nextInt();
			person.setPincode(zip);

			System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
			int PhoneNo = scanner.nextInt();
			person.setMobileNo(PhoneNo);

			System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
		}

	}
}

