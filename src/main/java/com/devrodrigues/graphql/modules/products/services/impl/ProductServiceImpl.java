package com.devrodrigues.graphql.modules.products.services.impl;

import com.devrodrigues.graphql.modules.products.domain.entities.Product;
import com.devrodrigues.graphql.modules.products.repository.ProductRepository;
import com.devrodrigues.graphql.modules.products.services.ProductService;
import org.springframework.stereotype.Service;
import reactor.util.annotation.NonNull;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getBy(@NonNull String description) {
        return repository.getBy(description);
    }
}
