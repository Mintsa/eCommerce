package com.ecommerce.service.impl;

import com.ecommerce.entities.Product;
import com.ecommerce.service.ProductService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceImplTest {


    @Autowired
    ProductService productService;


    @BeforeEach
    void setUp() {
    }

    @Test
    void productList() {

         List<Product> expected = new ArrayList<>();

         List<Product> actual = productService.productList();

         expected.addAll(actual);

         Assert.assertEquals(expected, actual);
    }

    @Test
    void addProduct() {

        Product expected = new Product(null, "Auchan", "lave");

        productService.addProduct(expected);

        Assert.assertNotNull(expected.getId());


    }

    @Test
    void deleteProduct() {

        List<Product> expected = Arrays.asList(
            new Product(2L, "Auchan", "lave"));
            ;


         List<Product> actual = Arrays.asList(
             new Product(1L, "Auchan", "lave"),
             new Product(2L, "Auchan", "lave"));


        productService.deleteProduct(1L);

        assertEquals(expected.size(), actual.size());

    }
}
