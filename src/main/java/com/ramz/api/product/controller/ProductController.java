package com.ramz.api.product.controller;


import com.ramz.api.product.model.Inventory;
import com.ramz.api.product.model.Price;
import com.ramz.api.product.model.Product;
import com.ramz.api.product.model.Reviews;
import com.ramz.api.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ramz/api/product")
@AllArgsConstructor
public class ProductController {

    ProductService service;

    @GetMapping
    @RequestMapping("/info/{productId}")
    public ResponseEntity<Product> getProductDetails(@PathVariable String productId){
        return  new ResponseEntity<Product>(service.getProduct(productId), HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("/price/{productId}")
    public ResponseEntity<Price> getPrice(@PathVariable String productId){
        return  new ResponseEntity<Price>(service.getPrice(productId), HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("/reviews/{productId}")
    public ResponseEntity<Reviews> getReviews(@PathVariable String productId){
        return  new ResponseEntity<Reviews>(service.getReviews(productId), HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("/inventory/{productId}")
    public ResponseEntity<Inventory> getInventory(@PathVariable String productId){
        return  new ResponseEntity<Inventory>(service.getInventory(productId), HttpStatus.OK);
    }

}
