package com.lloyds.classroom_service.controller.response;

public record UnifiedProduct(int productUid,
                             String productType,
                             String name,
                             String fullUrl,
                             double unitPrice,
                             String unitPriceMeasure,
                             int unitPriceMeasureAmount) {
}
