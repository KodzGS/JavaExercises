public class MobileClass {

  public static void main(String[] args) {

    MobilePhone kodisPhone = new MobilePhone("112234455666");

    Contact contact1 = Contact.createContact("Floyd Mayweather", "31415926");
    Contact contact2 = Contact.createContact("Miguel Cotto", "16180339");
    Contact contact3 = Contact.createContact("Pernell Whittaker", "11235813");
    Contact contact4 = Contact.createContact("Katie Taylor", "11235813");
    Contact contact5 = Contact.createContact("Anthony Joshua", "8899500005");
    Contact contact6 = Contact.createContact("Oleksander Usyk", "8899500005");
    Contact contact7 = Contact.createContact("Daniel Dubois", "8578993030");
    Contact contact8 = Contact.createContact("Bud Crawford", "8899500005");
    Contact contact9 = Contact.createContact("Andre Ward", "u7788488995");

    kodisPhone.addNewContact(contact1);
    kodisPhone.addNewContact(contact1);
    kodisPhone.addNewContact(contact2);
    kodisPhone.addNewContact(contact3);
    kodisPhone.addNewContact(contact4);
    kodisPhone.updateContact(contact5, contact6);
    kodisPhone.addNewContact(contact8);
    kodisPhone.removeContact(contact3);
    kodisPhone.queryContact(contact5.getName());
    kodisPhone.findContact(contact7.getName());
    kodisPhone.removeContact(contact9);
    kodisPhone.printContacts();


  }
}




