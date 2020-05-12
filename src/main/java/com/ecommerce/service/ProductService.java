package com.ecommerce.service;

import com.ecommerce.entities.Product;

import java.util.List;


public interface ProductService {

    List<Product> productList();

    void addProduct(Product product);

    void deleteProduct(Long id);



}
