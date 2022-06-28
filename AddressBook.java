/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * @author MD_AFROZ
 *
 */
public class AddressBook {
	List<Contact> listContact = new ArrayList<Contact>();
	Contact con = new Contact(toString(), toString(), toString(), toString(), toString(), toString(), toString(),
			toString());
	static Scanner scanner = new Scanner(System.in);

	// Create Contacts
	// Adding new contact method
	public void addContact(Contact contact) {
		
		
				System.out.println("Enter first Name");
					String firstName = scanner.next();

					System.out.println("Enter last Name");
					String lastName = scanner.next();

					System.out.println("Enter Email");
					String email = scanner.next();

					System.out.println("Enter phone number");
					String phoneNumber = scanner.next();

					System.out.println("Enter address");
					String address = scanner.next();

					System.out.println("Enter state");
					String state = scanner.next();

					System.out.println("Enter city");
					String city = scanner.next();

					System.out.println("Enter zip");
					String zip = scanner.next();

					listContact.add(new Contact(firstName, lastName, email, phoneNumber, address, state, city, zip));
					printContacts();
		}
			
	public Contact printContacts() {
		if (listContact.isEmpty()) {
			System.out.println("No Records!!!");
		} else {
			for (Contact contacts : listContact) {
				System.out.println(contacts);
			}
		}
		return con;
	}


}
