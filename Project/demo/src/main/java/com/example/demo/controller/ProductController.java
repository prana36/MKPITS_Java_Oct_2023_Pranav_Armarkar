package com.example.demo.controller;

import com.example.demo.dto.ProductContainerDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController is simply use to anointed To this class is Controller Class
public class ProductController {

    @Autowired // @Autowired is simply use to anointed To
    IProductService iProductService;

    @RequestMapping("/products") //@RequestMapping is simply use to anoint The Target of Responses
    public ResponseEntity<Object> getProduct(){
        ProductContainerDto products = iProductService.getProductDetails();

        // it is simply use to Check
        System.out.println("Autowired EMP Service: "+iProductService.hashCode());

        return ResponseEntity.ok(products);
    }
}
