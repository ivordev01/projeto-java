package br.fatec.product.mappers;

import br.fatec.product.dtos.ProductRequest;
import br.fatec.product.dtos.ProductResponse;
import br.fatec.product.entitites.Product;

public class ProductMapper {

    public static Product toEntity(ProductRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.name());
        product.setPrice(productRequest.price());
        product.setCategory(productRequest.category());

        return product;
    }

    public static ProductResponse toDTO(Product product){
        return new ProductResponse(product.getId(), product.getName(), product.getPrice(), product.getCategory());
    }
}
