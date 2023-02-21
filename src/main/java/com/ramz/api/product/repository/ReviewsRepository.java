package com.ramz.api.product.repository;

import com.ramz.api.product.model.Product;
import com.ramz.api.product.model.Reviews;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewsRepository extends CrudRepository<Reviews, String> {

    Optional<Reviews> findByProductId(String productId);

}
