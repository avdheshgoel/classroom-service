package com.lloyds.classroom_service.client.model;

public record Product(int productUid,
                      String productType,
                      String name,
                      String fullUrl) {
}
