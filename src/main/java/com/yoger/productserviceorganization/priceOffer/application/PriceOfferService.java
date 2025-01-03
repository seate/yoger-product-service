package com.yoger.productserviceorganization.priceOffer.application;

import com.yoger.productserviceorganization.priceOffer.adapters.web.dto.request.ConfirmOfferRequestDTO;
import com.yoger.productserviceorganization.priceOffer.adapters.web.dto.request.PriceOfferRequestDTO;
import com.yoger.productserviceorganization.priceOffer.adapters.web.dto.response.PriceOffersResponseDTO;

public interface PriceOfferService {

    void create(Long productId, Long companyId, PriceOfferRequestDTO priceOfferRequestDTO);

    PriceOffersResponseDTO getAllByProductId(Long productId);

    void update(Long productId, Long companyId, PriceOfferRequestDTO priceOfferRequestDTO);

    void confirm(Long productId, Long requesterId, ConfirmOfferRequestDTO confirmOfferRequestDTO);

    void delete(Long productId, Long companyId);
}
