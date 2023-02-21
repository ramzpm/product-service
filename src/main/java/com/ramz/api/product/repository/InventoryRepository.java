package com.ramz.api.product.repository;

import com.ramz.api.product.model.Inventory;
import com.ramz.api.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, String> {

    Optional<Inventory> findByProductId(String productId);

}
