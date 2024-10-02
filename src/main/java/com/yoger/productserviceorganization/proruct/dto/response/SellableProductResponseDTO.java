package com.yoger.productserviceorganization.proruct.dto.response;

import com.yoger.productserviceorganization.proruct.domain.ProductState;
import com.yoger.productserviceorganization.proruct.persistence.ProductEntity;

public record SellableProductResponseDTO(
        String name,
        String priceByQuantity,
        String description,
        String imageUrl,
        ProductState state
) {
    public static SellableProductResponseDTO from(ProductEntity productEntity) {
        return new SellableProductResponseDTO(
                productEntity.getName(),
                productEntity.getPriceByQuantity(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getState()
        );
    }
}
