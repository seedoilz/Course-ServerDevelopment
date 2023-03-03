package contactos;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
public class ContactList {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }
}
