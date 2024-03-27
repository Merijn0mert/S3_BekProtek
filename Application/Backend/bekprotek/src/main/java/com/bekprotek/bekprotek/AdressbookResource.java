package com.bekprotek.bekprotek;

import org.springframework.web.bind.annotation.*;
import com.bekprotek.bekprotek.Contact;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class AdressbookResource {

    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();
    
    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id)
    {
        return contacts.get(id);
    }

    @GetMapping("/")
    public List<Contact> getAllContacts()
    {
        return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact)
    {
        contacts.put(contact.getId(), contact);
        return contact;
    }       
}
