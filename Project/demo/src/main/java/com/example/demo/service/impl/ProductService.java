package com.example.demo.service.impl;

import com.example.demo.dto.ProductContainerDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService
{

    @Override
    public ProductContainerDto getProductDetails(){
        ProductContainerDto productContainerDto = new ProductContainerDto();

        List<ProductDto> productDtoList = new ArrayList<ProductDto>();

        ProductDto productDto = new ProductDto();
        productDto.setId(1);
        productDto.setProductName("Remote Control bike");
        productDto.setProductDiscription("A bike Which Can oprate from remote ");
        productDto.setProductPrice(3000);

        ProductDto productDto1 = new ProductDto();
        productDto1.setId(2);
        productDto1.setProductName("Remote Control Car");
        productDto1.setProductDiscription("A Car Which Can oprate from remote ");
        productDto1.setProductPrice(4000);


        ProductDto productDto2 = new ProductDto();
        productDto2.setId(3);
        productDto2.setProductName("Remote Control Car");
        productDto2.setProductDiscription("A Car Which Can oprate from remote ");
        productDto2.setProductPrice(5000);

        ProductDto productDto3 = new ProductDto();
        productDto3.setId(4);
        productDto3.setProductName("Remote Control Car");
        productDto3.setProductDiscription("A Car Which Can oprate from remote ");
        productDto3.setProductPrice(9000);




        productDtoList.add(productDto);
        productDtoList.add(productDto1);
        productDtoList.add(productDto2);
        productDtoList.add(productDto3);

        productContainerDto.setProductContainer(productDtoList);

        return productContainerDto ;
    }
}
