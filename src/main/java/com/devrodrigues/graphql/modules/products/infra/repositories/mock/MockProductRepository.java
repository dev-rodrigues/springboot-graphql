package com.devrodrigues.graphql.modules.products.infra.repositories.mock;

import com.devrodrigues.graphql.modules.products.domain.entities.Product;
import com.devrodrigues.graphql.modules.products.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MockProductRepository implements ProductRepository {

    private final List<Product> products = List.of(
            new Product(1L, "banana", BigDecimal.ONE),
            new Product(2L, "apple", BigDecimal.TEN),
            new Product(3L, "orange", BigDecimal.ONE)
    );

    @Override
    public List<Product> getBy(String description) {
        return this.products
                .stream()
                .filter(it -> it.getDescription().contains(description))
                .collect(Collectors.toList());
    }
}
