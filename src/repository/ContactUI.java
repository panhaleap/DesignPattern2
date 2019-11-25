package repository;

import java.util.List;

public class ContactUI {

    List<Contact> repository;

    public ContactUI(List<Contact> repository){
        this.repository = repository;
    }

    public void add(Contact obj){
        repository.add(obj);
    }
    public void remove(Contact obj){
        repository.remove(obj);
    }
    public void printAllContacts(){
        for (Contact contact : repository){
            System.out.println(contact);
        }
    }
}
