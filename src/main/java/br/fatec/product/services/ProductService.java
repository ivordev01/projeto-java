package br.fatec.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.product.entitites.Product;
import br.fatec.product.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;

@Service

public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(long id){
        return repository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Produto não cadastrado")
        );
    }

}
