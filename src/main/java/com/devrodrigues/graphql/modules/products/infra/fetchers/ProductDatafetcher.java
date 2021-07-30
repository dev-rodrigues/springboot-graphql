package com.devrodrigues.graphql.modules.products.infra.fetchers;

import com.devrodrigues.graphql.modules.products.domain.entities.Product;
import com.devrodrigues.graphql.modules.products.services.ProductService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;

@DgsComponent
public class ProductDatafetcher {

    private final ProductService productService;

    public ProductDatafetcher(ProductService productService) {
        this.productService = productService;
    }

    @DgsData(parentType = "Query", field = "products")
    public List<Product> products(@InputArgument("descriptionFilter") String filter) {
        return productService.getBy(filter);
    }
}
