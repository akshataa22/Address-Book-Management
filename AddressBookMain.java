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

        // Adding a new contact using console input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for a new contact:");
        System.out.print("First Name: ");
        String newFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String newLastName = scanner.nextLine();
        System.out.print("Address: ");
        String newAddress = scanner.nextLine();
        System.out.print("City: ");
        String newCity = scanner.nextLine();
        System.out.print("State: ");
        String newState = scanner.nextLine();
        System.out.print("ZIP: ");
        String newZip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String newEmail = scanner.nextLine();

        // Creating a new contact with user input
        Contact newContact = new Contact(newFirstName, newLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);

        // Adding the new contact to the address book
        addressBook.addContact(newContact);

        // Displaying the updated contacts
        System.out.println("Updated Contact Details from Address Book:");
        addressBook.displayContacts();

        // Editing an existing contact's firstName using console input
        System.out.println("Enter the First Name of the contact you want to edit:");
        String editFirstName = scanner.nextLine();

        // Editing the contact's firstName
        addressBook.editContact(editFirstName);

        // Deleting an existing contact using console input
        System.out.println("Enter the First Name of the contact you want to delete:");
        String deleteFirstName = scanner.nextLine();

        // Deleting the contact
        addressBook.deleteContact(deleteFirstName);

        // Displaying the final contacts
        System.out.println("Final Contact Details from Address Book:");
        addressBook.displayContacts();
    }
}
