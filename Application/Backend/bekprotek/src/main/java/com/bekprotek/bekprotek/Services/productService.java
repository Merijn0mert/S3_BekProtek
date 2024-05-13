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
public class productService {

    private productRepository productrepo;

    @Autowired
    public productService(productRepository productrepo) {
        this.productrepo = productrepo;
    }


    public Collection<productEntity> getProducts() {
        return productrepo.findAll();
    }

    public Optional<productEntity> getProduct(Long id) {
        return productrepo.findById(id);
    }

}