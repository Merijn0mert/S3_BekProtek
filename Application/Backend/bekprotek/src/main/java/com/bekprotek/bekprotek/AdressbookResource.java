package com.bekprotek.bekprotek;

import org.springframework.web.bind.annotation.*;
import com.bekprotek.bekprotek.Contact;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class AdressbookResource {

    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();
    final private AdressbookService service;

    @Autowired
    public AdressbookResource (AdressbookService service)
    {
        this.service = service;
    }
/*    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id)
    {
        return contacts.get(id);
    }*/

    @GetMapping("/hello")
    public List<Contact> getAllContacts()
    {
        return new ArrayList<Contact>(contacts.values());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getContact(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.getContact(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact)
    {
        contacts.put(contact.getId(), contact);
        return contact;
    }       
}
