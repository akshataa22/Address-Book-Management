package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private String addressBookName;
    private ArrayList<Contact> contacts;

    public AddressBook() {
        this.addressBookName = addressBookName;
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println("First Name: " + contact.firstName);
            System.out.println("Last Name: " + contact.lastName);
            System.out.println("Address: " + contact.address);
            System.out.println("City: " + contact.city);
            System.out.println("State: " + contact.state);
            System.out.println("ZIP: " + contact.zip);
            System.out.println("Phone Number: " + contact.phoneNumber);
            System.out.println("Email: " + contact.email);
            System.out.println("-----------------------");
        }
    }

    public void editContact(String inputFirstName) {
        for (Contact contact : contacts) {
            if (contact.firstName.equals(inputFirstName)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter new details for the contact:");
                System.out.print("New First Name: ");
                String newFirstName = sc.nextLine();

                contact.firstName = newFirstName;
                System.out.println("Contact name changed to " + contact.firstName);

                System.out.println("Contact details updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(String firstName) {
        for (Contact contact : contacts) {
            if (contact.firstName.equals(firstName)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
