package repository_practice;

public class TestRepositoryPractice {
    public static void main(String[] args) {
        Repository<Contact> repository = new InMemoryListRepository();
        ContactUI contactUI = new ContactUI(repository);

        Contact contact1 = new Friend();
        contact1.name = "Hana";
        ((Friend)contact1).phoneNumber = "1111";

        Contact contact2 = new Work();
        contact2.name = "Hyri";
        ((Work)contact2).email = "hyri@gg.com";

        contactUI.add(contact1);
        contactUI.add(contact2);
        contactUI.displayAllContacts();
    }
}
