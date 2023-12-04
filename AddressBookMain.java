package Day11;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management program.");

        AddressBook addressBook = new AddressBook();

        Contact contact = new Contact("Akshata", "Dhanawade", "Link Road", "Mumbai", "Maharashtra", "400064", "1234-5678", "dhanawadeakshata53@gmail.com");
        addressBook.addContact(contact);

        System.out.println("Contact Details from Address Book:");
        addressBook.displayContacts();

        // Editing an existing contact's firstName using console input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name of the contact you want to edit:");
        String oldFirstName = scanner.nextLine();

        // Editing the contact's firstName
        addressBook.editContact(oldFirstName);

        // Displaying the updated contacts
        System.out.println("Updated Contact Details from Address Book:");
        addressBook.displayContacts();

    }
}
