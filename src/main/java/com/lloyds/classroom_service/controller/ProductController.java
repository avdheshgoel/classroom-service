package com.lloyds.classroom_service.controller;


import com.lloyds.classroom_service.client.ProductsClient;
import com.lloyds.classroom_service.client.model.Product;
import com.lloyds.classroom_service.client.model.ProductPrice;
import com.lloyds.classroom_service.controller.response.UnifiedProduct;
import com.lloyds.classroom_service.service.UnifiedProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class ProductController
{

    @Autowired
    private UnifiedProductService unifiedProductService;

    @Autowired
    private ProductsClient productsClient;

    @GetMapping(value = "/products")
    public ResponseEntity<Set<UnifiedProduct>> getProducts (
            @RequestParam(value = "type", required = false) String productType) {

        try {
            Set<Product> products =  productsClient.getProducts();
            Set<ProductPrice> productPrices = productsClient.getProductsPrices();
            if(productPrices == null || products == null) {
                return ResponseEntity.status(500).build();
            }
            Set<UnifiedProduct> unifiedProducts = unifiedProductService.unifyProducts(products, productPrices, productType);

            return ResponseEntity.ok(unifiedProducts);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}
