package com.lloyds.classroom_service.service;

import com.lloyds.classroom_service.client.model.Product;
import com.lloyds.classroom_service.client.model.ProductPrice;
import com.lloyds.classroom_service.controller.response.UnifiedProduct;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class UnifiedProductService {

    public static Set<UnifiedProduct> unifyProducts (Set<Product> products, Set<ProductPrice> prices) {

        Set<UnifiedProduct> unifiedProducts = new HashSet<>();

        Map<Integer, ProductPrice> productPriceMap = new HashMap<>();
        for (ProductPrice productPrice : prices) {
            productPriceMap.put(productPrice.productUid(), productPrice);
        }

        for (Product product : products) {
            ProductPrice price = productPriceMap.get(product.productUid());
            if (price != null) {
                UnifiedProduct unifiedProduct = new UnifiedProduct(
                        product.productUid(),
                        product.productType(),
                        product.name(),
                        product.fullUrl(),
                        price.unitPrice(),
                        price.unitPriceMeasure(),
                        price.unitPriceMeasureAmount());

                unifiedProducts.add(unifiedProduct);
            }
        }
        return unifiedProducts;
    }
}
