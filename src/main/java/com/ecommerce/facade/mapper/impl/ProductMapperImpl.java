package com.ecommerce.facade.mapper.impl;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entities.Product;
import com.ecommerce.entities.form.ProductForm;
import com.ecommerce.facade.mapper.ProductMapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto entityToDto(Product product){

        ProductDto productDto = new ProductDto();

        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setPhoto(product.getPhoto());
        productDto.setPhotoName(product.getPhotoName());
        productDto.setQuantity(product.getQuantity());

        return productDto;

    }

    @Override
    public List<ProductDto>  entitiesToDTOs(List<Product> products){

        return products.stream().filter(Objects::nonNull).
            map(this::entityToDto).
            collect(Collectors.toList());

    }




    @Override
    public Product DtoToEntity(ProductDto productDto){

        Product product = new Product();

        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setPhoto(productDto.getPhoto());
        product.setPhotoName(productDto.getPhotoName());
        product.setQuantity(productDto.getQuantity());

        return product;
    }


    @Override
    public Product formToEntity(ProductForm productForm) {
        Product product = new Product();

        product.setId(productForm.getId());
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        product.setDescription(productForm.getDescription());
        product.setPhoto(productForm.getPhoto());
        product.setPhotoName(productForm.getPhotoName());
        product.setQuantity(productForm.getQuantity());

        return product;
    }


    @Override
    public List<Product> DtOsToEntities(List<ProductDto> productDtos){

        return productDtos.stream().filter(Objects::nonNull).
            map(this::DtoToEntity).
            collect(Collectors.toList());
    }


}
