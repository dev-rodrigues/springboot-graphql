package com.devrodrigues.graphql.modules.promotions.services;

import com.devrodrigues.graphql.modules.promotions.domain.entities.Promotion;

import java.time.LocalDate;
import java.util.List;

public interface PromotionServices {

    public List<Promotion> getBy(LocalDate date);
}
