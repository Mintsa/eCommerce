package com.ecommerce.service.mapper;


import com.ecommerce.domain.Product;
import com.ecommerce.service.dto.ProductDto;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductMapper {


     public ProductDto productToProductDto(Product product){

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


     public List<ProductDto>  productsToProductDTOs(List<Product> products){

         return products.stream().filter(Objects::nonNull).
             map(this::productToProductDto).
             collect(Collectors.toList());

     }





     public Product productDtoToProduct(ProductDto productDto){

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


     public List<Product> productDTOsToProducts(List<ProductDto> productDtos){

         return productDtos.stream().filter(Objects::nonNull).
             map(this::productDtoToProduct).
             collect(Collectors.toList());
     }


}
