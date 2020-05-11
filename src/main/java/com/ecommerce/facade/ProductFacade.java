package com.ecommerce.facade;

import com.ecommerce.domain.Product;
import com.ecommerce.service.ProductService;
import com.ecommerce.service.dto.ProductDto;
import com.ecommerce.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductFacade {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductService productService;


    public List<ProductDto> products(){

        List<ProductDto> productDTOs = productMapper.productsToProductDTOs(productService.productList());

        return productDTOs;
    }
}
