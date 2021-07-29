package com.devrodrigues.graphql.modules.promotions.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promotion {

    private final String description;
    private final BigDecimal discount;
    private final LocalDate initialDate;
    private final LocalDate finalDate;

    public Promotion(String description, BigDecimal discount, LocalDate initialDate, LocalDate finalDate) {
        this.description = description;
        this.discount = discount;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "description='" + description + '\'' +
                ", discount=" + discount +
                ", initialDate=" + initialDate +
                ", finalDate=" + finalDate +
                '}';
    }
}
