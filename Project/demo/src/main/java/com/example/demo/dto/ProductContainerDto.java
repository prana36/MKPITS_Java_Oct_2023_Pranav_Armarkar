package com.example.demo.dto;

import java.util.List;

public class ProductContainerDto
{
    // Create list type of variable which can Store no. of product In list format
    private List<ProductDto> products;

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
