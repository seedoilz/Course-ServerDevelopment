package contactos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Slf4j
@Controller
@SessionAttributes("contactList")
public class ContactController {
    private ContactList contacts = new ContactList();
    @GetMapping
    public String showHome() {
        return "home";
    }

    @ModelAttribute(name = "contact")
    public Contact contact(){
        return new Contact();
    }

    @ModelAttribute(name = "contactList")
    public ContactList contacts() {
        return contacts;
    }

    @PostMapping
    public String processContact(@Valid Contact contact, Errors errors,
                               @ModelAttribute ContactList contactList,
                               SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            return "home";
        }
        contactList.addContact(contact);
        System.out.println(contactList.contacts.size());
        log.info("Contact submitted", contact);
        sessionStatus.setComplete();

        return "home";
    }
}
