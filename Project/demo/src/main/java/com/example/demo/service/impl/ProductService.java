package com.example.demo.service.impl;

import com.example.demo.dto.ProductContainerDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // @Service is simply use to anointed To this class is service layer
public class ProductService implements IProductService
{

    @Override
    public ProductContainerDto getProductDetails(){




        //Create an Object Of productDto Class
        ProductDto productDto = new ProductDto();
        //Set Values Of Attributes

        productDto.setId(101);
        productDto.setProductName("Remote Control bike");
        productDto.setProductDiscription("A bike Which Can operate from remote ");
        productDto.setProductPrice(3000);

        //Create an Object Of productDto Class
        ProductDto productDto1 = new ProductDto();
        //Set Values Of Attributes
        productDto1.setId(102);
        productDto1.setProductName("Remote Control Car");
        productDto1.setProductDiscription("A Car Which Can operate from remote ");
        productDto1.setProductPrice(4000);


        //Create an Object Of productDto Class
        ProductDto productDto2 = new ProductDto();
        //Set Values Of Attributes
        productDto2.setId(103);
        productDto2.setProductName("Remote Control Car");
        productDto2.setProductDiscription("A Car Which Can operate from remote ");
        productDto2.setProductPrice(5000);

        //Create an Object Of productDto Class
        ProductDto productDto3 = new ProductDto();
        //Set Values Of Attributes
        productDto3.setId(104);
        productDto3.setProductName("Remote Control Car");
        productDto3.setProductDiscription("A Car Which Can operate from remote ");
        productDto3.setProductPrice(9000);

        //Create an Object Of productDto Class
        ProductDto productDto4 = new ProductDto();
        //Set Values Of Attributes
        productDto4.setId(105);
        productDto4.setProductName("Remote Control Car");
        productDto4.setProductDiscription("A Car Which Can operate from remote ");
        productDto4.setProductPrice(9000);


        //Create an Object Of List Class

        List<ProductDto> productDtoList = new ArrayList<ProductDto>();
        //Adding the values Which Is Already Set in productDto
        productDtoList.add(productDto);
        productDtoList.add(productDto1);
        productDtoList.add(productDto2);
        productDtoList.add(productDto3);
        productDtoList.add(productDto4);

        // create an Object of productContainerDto class Which can Set the the list od values
        ProductContainerDto productContainerDto = new ProductContainerDto();

        productContainerDto.setProducts(productDtoList);

        // Returing the productContainerDto Object
        return productContainerDto ;
    }
}
