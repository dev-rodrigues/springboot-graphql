package com.devrodrigues.graphql.modules.products.services;

import com.devrodrigues.graphql.modules.products.domain.entities.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getBy(String description);
}
