package com.example.demo.controller;

import com.example.demo.dto.ProductContainerDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    IProductService iProductService;

    @RequestMapping("/products")
    public ResponseEntity<Object> getProduct(){
        ProductContainerDto productDto = iProductService.getProductDetails();
        System.out.println("Autowired EMP Service: "+iProductService.hashCode());

        return ResponseEntity.ok(productDto);
    }
}
