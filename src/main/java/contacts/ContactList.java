package contacts;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data

public class ContactList {
    @ManyToMany
    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }
}
