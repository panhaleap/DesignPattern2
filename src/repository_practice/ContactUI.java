package repository_practice;

import java.util.ArrayList;
import java.util.List;

public class ContactUI {
    List<Contact> repository;

    public ContactUI(List<Contact> repository){
        this.repository = repository;
    }

    public void add(Contact contact){
        repository.add(contact);
    }

    public void remove(Contact contact){
        repository.remove(contact);
    }

    public void displayAllContacts(){
        for(Contact contact : repository){
            System.out.println(contact);
        }
    }

}
