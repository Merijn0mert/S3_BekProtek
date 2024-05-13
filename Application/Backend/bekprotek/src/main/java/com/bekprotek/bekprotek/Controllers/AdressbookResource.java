package com.bekprotek.bekprotek.Controllers;

import org.springframework.web.bind.annotation.*;
import com.bekprotek.bekprotek.Entities.*;
import com.bekprotek.bekprotek.Services.*;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@CrossOrigin
public class AdressbookResource {

    //ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();
    final private AdressbookService service;

    @Autowired
    public AdressbookResource (AdressbookService service)
    {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> getContacts() {
        return new ResponseEntity<>(service.getContacts(), HttpStatus.OK);
        //return System.out.println("hello"):
    }


    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable("id") Long id) {
        Optional<Contact> optionalContact = service.getContact(id);

        if (optionalContact.isPresent()) {
            Contact contact = optionalContact.get();
            return ResponseEntity.ok(contact);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

/*    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getContacts(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.getContact(id), HttpStatus.OK);
    }*/
/*    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<Object> getContacts2() {
        return new ResponseEntity<>(service.getContacts(), HttpStatus.OK);
    }*/
/*    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id)
    {
        return contacts.get(id);
    }*/

/*    @GetMapping("/hello")
    public List<Contact> getAllContacts()
    {
        return new ArrayList<Contact>(contacts.values());
    }*/

/*    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getContact(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.getContact(id), HttpStatus.OK);
    }*/

/*    @PostMapping("/")
    public Contact addContact(@RequestBody Contact contact)
    {

        return contact;
    }*/
}
