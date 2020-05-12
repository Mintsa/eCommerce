package com.ecommerce.facade;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entities.form.ProductForm;

import java.util.List;

public interface ProductFacade {

    List<ProductDto> products();

    void saveProduct(ProductForm productForm);





}
