package com.ramz.api.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Price {

    @Id
    String productId; 
    Float offerPrice;
    Float salePrice;
    String saleText;
    String offerText;

}
