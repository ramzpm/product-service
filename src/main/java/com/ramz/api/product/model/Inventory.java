package com.ramz.api.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;

@Slf4j
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Inventory {

    @Id
    String productId;
    Integer count;
    Boolean stockInTransit;
    String stockInTransitDate;

}
