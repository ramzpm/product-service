package com.ramz.api.product.service;

import com.ramz.api.product.model.Inventory;
import com.ramz.api.product.model.Price;
import com.ramz.api.product.model.Product;
import com.ramz.api.product.model.Reviews;
import com.ramz.api.product.repository.InventoryRepository;
import com.ramz.api.product.repository.PriceRepository;
import com.ramz.api.product.repository.ProductRepository;
import com.ramz.api.product.repository.ReviewsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {

    InventoryRepository inventoryRepository;

    PriceRepository priceRepository;

    ReviewsRepository reviewsRepository;

    ProductRepository productRepository;

    public Product getProduct(String productId) {
        return productRepository.findByProductId(productId).get();
    }

    public Price getPrice(String productId) {
        return priceRepository.findByProductId(productId).get();
    }

    public Reviews getReviews(String productId) {
        return reviewsRepository.findByProductId(productId).get();
    }

    public Inventory getInventory(String productId) {
        return inventoryRepository.findByProductId(productId).get();
    }
}
