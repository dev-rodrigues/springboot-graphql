package com.devrodrigues.graphql.modules.promotions.services.impl;

import com.devrodrigues.graphql.modules.promotions.domain.entities.Promotion;
import com.devrodrigues.graphql.modules.promotions.repository.PromotionRepository;
import com.devrodrigues.graphql.modules.promotions.services.PromotionServices;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PromotionServicesImpl implements PromotionServices {

    private final PromotionRepository repository;

    public PromotionServicesImpl(PromotionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Promotion> getBy(LocalDate date) {
        return repository.getBy(date);
    }
}
