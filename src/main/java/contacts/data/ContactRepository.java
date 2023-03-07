package contacts.data;

import contacts.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository
        extends CrudRepository<Contact, Long> {
}
