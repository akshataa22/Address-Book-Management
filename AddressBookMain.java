package Day11;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management program.");

        AddressBook addressBook = new AddressBook();

        Contact contact = new Contact("Akshata","Dhanawade","...","Mumbai","Maharashtra","400000","1234-5678","dhanawadeakshata53@gmail.com");
        addressBook.addContact(contact);

        System.out.println("Contact Details from Address Book:");
        addressBook.displayContacts();
    }
}
