package repository_practice;

import java.util.ArrayList;
import java.util.List;

public class InMemoryListRepository implements Repository<Contact> {
    List<Contact> contacts = new ArrayList<>();

    @Override
    public void add(Contact obj) {
        contacts.add(obj);
    }

    @Override
    public void remove(Contact obj) {
        contacts.remove(obj);
    }

    @Override
    public String getAll() {
        StringBuilder temp = new StringBuilder();
        for(Contact contact : contacts){
           temp.append(contact).append("\n");
        }
        return temp.toString();
    }
}
