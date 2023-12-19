package Day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
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

    public void sortContactsByName() {
        List<Contact> sortedContacts = contacts.stream()
                .sorted(Comparator.comparing(Contact::getFullName))
                .collect(Collectors.toList());

        contacts.clear();
        contacts.addAll(sortedContacts);
    }

    public List<Contact> sortContactsByCity() {
        return contacts.stream()
                .sorted(Comparator.comparing(Contact::getCity))
                .collect(Collectors.toList());
    }

    public List<Contact> sortContactsByState() {
        return contacts.stream()
                .sorted(Comparator.comparing(Contact::getState))
                .collect(Collectors.toList());
    }

    public List<Contact> sortContactsByZip() {
        return contacts.stream()
                .sorted(Comparator.comparing(Contact::getZip))
                .collect(Collectors.toList());
    }

    public void displayContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            contacts.forEach(contact -> System.out.println(contact.toString()));
        }
    }


    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
