package repository_practice;

public class ContactUI {
    //List<Contact> repository;
    Repository<Contact> repository;

    public ContactUI(Repository<Contact> repository)
    {
        this.repository = repository;
    }

    public void add(Contact obj)
    {
        repository.add(obj);
    }

    public void remove(Contact obj)
    {
        repository.remove(obj);
    }

    public void displayAllContacts()
    {
        System.out.println(repository.getAll());

    }


}
