package com.ramz.api.product.repository;

import com.ramz.api.product.model.Price;
import com.ramz.api.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriceRepository extends CrudRepository<Price, String> {

    Optional<Price> findByProductId(String productId);

}
