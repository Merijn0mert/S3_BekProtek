package com.bekprotek.bekprotek.Repositories;

import com.bekprotek.bekprotek.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdressbookDAO extends JpaRepository<Contact,Long> {
    /*Contact findById(String id);*/
/*    List<Contact> findAll();*/
}
