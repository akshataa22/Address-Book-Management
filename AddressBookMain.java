package Day11;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management program.");

        AddressBook addressBook = new AddressBook();

        Contact contact = new Contact("Akshata", "Dhanawade", "Link Road", "Mumbai", "Maharashtra", "400064", "1234-5678", "dhanawadeakshata53@gmail.com");
        addressBook.addContact(contact);

        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("1. Add a new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Edit Name");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter details for a new contact:");
                    System.out.print("First Name: ");
                    String newFirstName = sc.nextLine();
                    System.out.print("Last Name: ");
                    String newLastName = sc.nextLine();
                    System.out.print("Address: ");
                    String newAddress = sc.nextLine();
                    System.out.print("City: ");
                    String newCity = sc.nextLine();
                    System.out.print("State: ");
                    String newState = sc.nextLine();
                    System.out.print("ZIP: ");
                    String newZip = sc.nextLine();
                    System.out.print("Phone Number: ");
                    String newPhoneNumber = sc.nextLine();
                    System.out.print("Email: ");
                    String newEmail = sc.nextLine();
                    Contact newContact = new Contact(newFirstName, newLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);
                    addressBook.addContact(newContact);
                    System.out.println("Contact added successfully!");
                    break;
                case "2":
                    System.out.println("Contact Details:");
                    addressBook.displayContacts();
                    break;
                case "3":
                    System.out.println("Enter the First Name of the contact you want to edit:");
                    String editFirstName = sc.nextLine();

                    addressBook.editContact(editFirstName);
                    addressBook.displayContacts();
                    break;
                case "4":
                    System.out.println("Enter the First Name of the contact you want to delete:");
                    String deleteFirstName = sc.nextLine();

                    addressBook.deleteContact(deleteFirstName);
                    break;
                case "5":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again...");
                    break;
            }
            System.out.println();
        } while (!choice.equals("5"));

        sc.close();

        addressBook.displayContacts();
    }
}
