package com.ecommerce.facade.impl;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entities.Product;
import com.ecommerce.entities.form.ProductForm;
import com.ecommerce.facade.ProductFacade;
import com.ecommerce.service.ProductService;
import com.ecommerce.facade.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductFacadeImpl  implements ProductFacade{


    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductService productService;



    @Override
    public void saveProduct(ProductForm productForm) {

        Product product = productMapper.formToEntity(productForm);

        productService.addProduct(product);
    }




    @Override
    public List<ProductDto> products(){

        List<ProductDto> productDTOs = productMapper.entitiesToDTOs(productService.productList());

        return productDTOs;
    }







}
