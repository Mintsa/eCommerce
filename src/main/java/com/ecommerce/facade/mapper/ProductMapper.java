package com.ecommerce.facade.mapper;


import com.ecommerce.entities.Product;
import com.ecommerce.dto.ProductDto;
import com.ecommerce.entities.form.ProductForm;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public interface ProductMapper {

      ProductDto entityToDto(Product product);

      List<ProductDto>  entitiesToDTOs(List<Product> products);

      Product DtoToEntity(ProductDto productDto);

      List<Product> DtOsToEntities(List<ProductDto> productDTOs);


       Product formToEntity(ProductForm productForm);

}
