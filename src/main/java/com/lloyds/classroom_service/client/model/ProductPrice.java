package com.lloyds.classroom_service.client.model;

public record ProductPrice(int productUid,
                           double unitPrice,
                           String unitPriceMeasure,
                           int unitPriceMeasureAmount) {
}
