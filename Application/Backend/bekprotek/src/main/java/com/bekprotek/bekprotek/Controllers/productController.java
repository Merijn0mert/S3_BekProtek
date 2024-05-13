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
@RequestMapping("/products")
public class productController {

    final private productService service;

    @Autowired
    public productController (productService service)
    {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> getProducts() {
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);

    }


    @GetMapping("/{id}")
    public ResponseEntity<productEntity> getProduct(@PathVariable("id") Long id) {
        Optional<productEntity> optionalProduct = service.getProduct(id);

        if (optionalProduct.isPresent()) {
            productEntity product = optionalProduct.get();
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}