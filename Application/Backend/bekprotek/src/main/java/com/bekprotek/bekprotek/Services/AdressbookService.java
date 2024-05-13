package com.bekprotek.bekprotek.Services;

import com.bekprotek.bekprotek.Controllers.*;
import com.bekprotek.bekprotek.Repositories.*;
import com.bekprotek.bekprotek.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;
import java.util.*;

@Service
public class AdressbookService {

    private AdressbookDAO adressrepo;

    @Autowired
    public AdressbookService(AdressbookDAO adressrepo) {
        this.adressrepo = adressrepo;
    }


    public Collection<Contact> getContacts() {
        return adressrepo.findAll();
    }

    public Optional<Contact> getContact(Long id) {
        return adressrepo.findById(id);
    }
/*    public Optional<Contact> getContact(String id) {
        return adressrepo.findById(Long.valueOf(id));
    }*/
}
