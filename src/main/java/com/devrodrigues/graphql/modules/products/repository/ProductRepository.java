package com.devrodrigues.graphql.modules.products.repository;

import com.devrodrigues.graphql.modules.products.domain.entities.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getBy(String description);
}
