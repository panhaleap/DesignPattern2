package repository;

import java.util.ArrayList;
import java.util.List;

public class TestRepository {
    public static void main(String[] args) {
        List<Contact> repository = new ArrayList<>();
        ContactUI contactUI = new ContactUI((repository));

        Contact contact1 = new Friend();
        contact1.name = "Alex";
        ((Friend)contact1).phoneNumber = "8980";

        Contact contact2 = new Work();
        contact2.name = "Berry";
        ((Work)contact2).email = "berry@ery.com";

        contactUI.add(contact1);
        contactUI.add(contact2);

        contactUI.printAllContacts();
    }
}
