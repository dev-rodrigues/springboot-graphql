package com.devrodrigues.graphql.modules.products.domain.entities;

import java.math.BigDecimal;

public class Product {

    private final Long id;
    private final String description;
    private final BigDecimal value;

    public Product(Long id, String description, BigDecimal value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}
