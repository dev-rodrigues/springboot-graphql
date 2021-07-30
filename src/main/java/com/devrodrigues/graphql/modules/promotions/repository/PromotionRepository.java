package com.devrodrigues.graphql.modules.promotions.repository;

import com.devrodrigues.graphql.modules.promotions.domain.entities.Promotion;

import java.time.LocalDate;
import java.util.List;

public interface PromotionRepository {

    List<Promotion> getBy(LocalDate date);
}
