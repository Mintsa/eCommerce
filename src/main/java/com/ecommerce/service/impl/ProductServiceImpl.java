package com.ecommerce.service.impl;

import com.ecommerce.entities.Product;
import com.ecommerce.dao.ProductRepository;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> productList() {
        return productRepository.findAll();
    }


    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {

        Product product = productRepository.findOne(id);

        if(product != null) {
            productRepository.delete(product);
        }

    }


    ;





}




