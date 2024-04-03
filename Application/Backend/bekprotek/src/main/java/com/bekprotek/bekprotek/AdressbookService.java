package com.bekprotek.bekprotek;

/*import com.bekprotek.bekprotek.AdressbookResource;
import com.bekprotek.bekprotek.AdressbookDAO;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;

@Service
public class AdressbookService {

    private final AdressbookDAO repo;

    @Autowired
    public AdressbookService(AdressbookDAO repo) {
        this.repo = repo;
    }

    public Collection<Contact> getContacts() {
        return repo.findAll();
    }
    public Optional<Contact> getContact(String id) {
        return repo.findById(Long.valueOf(id));
    }
}
