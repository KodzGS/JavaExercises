import java.util.ArrayList;
import java.util.List;
//test
public class MobilePhone {

    /**
     * Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
     */
    private String myNumber;
    private List<Contact> myContacts;

    /**
     * A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
     */
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    /**
     * addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists,
     * or false if the contact already exists.
     */
    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            System.out.println("Contact Exists " + contact.getName());
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    /**
     * updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact)
     * and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
     */
    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (!myContacts.contains(oldContact)) {
            myContacts.remove(oldContact);
            myContacts.add(newContact);
            return true;
        }
        else return false;
    }

    /**
     * removeContact(), has one parameter of type Contact and returns a boolean.
     * Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
     */
    public boolean removeContact(Contact contact) {

        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            System.out.println("Contact removed successfully");
            return true;
        }
        System.out.println("Contact doesn't exist");
        return false;
    }
    /**
     * findContact(), has one parameter of type Contact and returns an int.
     * The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
     */
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    /**
     * findContact(), same as above, only it has one parameter of type String.
     */
    public int findContact(String contactName) {

        if (myContacts.contains(myContacts.indexOf(contactName))) {
            System.out.println("Contact found");
            return myContacts.indexOf(contactName);
        }
        System.out.println("Not found");
        return -1;

    }

    /**
     * queryContact(), has one parameter of type String and returns a Contact.
     * Use the String to search for the name and then return the Contact. Return null otherwise.
     */
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            System.out.println("Its a match! " + position);
            return this.myContacts.get(position);

        }
        return null;
    }

    /**
     * printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
     */
    public void printContacts() {
        System.out.println("List of contacts: ");
        for (Contact contact : myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }

    }
}









