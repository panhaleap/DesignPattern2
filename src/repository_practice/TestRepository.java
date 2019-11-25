package repository_practice;

import java.util.ArrayList;
import java.util.List;

public class TestRepository {
    public static void main(String[] args) {
        Contact contact1 = new Friend();
        contact1.name = "Thyda";
        ((Friend)contact1).phoneNumber = "123345";

        Contact contact2 = new Work();
        contact2.name = "Wandida";
        ((Work)contact2).email = "wandida@gg.com";

        List<Contact> repository = new ArrayList<>();
        repository.add(contact1);
        repository.add(contact2);

        ContactUI contactUI = new ContactUI(repository);
        contactUI.displayAllContacts();
    }
}
