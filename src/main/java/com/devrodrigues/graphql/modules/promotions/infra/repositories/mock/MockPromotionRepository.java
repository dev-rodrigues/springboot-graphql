package com.devrodrigues.graphql.modules.promotions.infra.repositories.mock;

import com.devrodrigues.graphql.modules.promotions.domain.entities.Promotion;
import com.devrodrigues.graphql.modules.promotions.repository.PromotionRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MockPromotionRepository implements PromotionRepository {

    private final List<Promotion> promotions = List.of(
            new Promotion("merry christmas", BigDecimal.TEN, LocalDate.parse("2021-07-29"), LocalDate.parse("2021-08-29")),
            new Promotion("Easter", BigDecimal.ONE, LocalDate.parse("2021-10-29"), LocalDate.parse("2021-11-29"))
    );

    @Override
    public List<Promotion> getBy(LocalDate date) {
        return this.promotions
                .stream()
                .filter(it -> it.getInitialDate().compareTo(date) < 0 && it.getFinalDate().compareTo(date)>=0)
                .collect(Collectors.toList());
    }
}
