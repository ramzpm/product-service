package com.ramz.api.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {

    @Id
    String productId;
    String title;
    String brand;
    String description;
    String partnumber;
    String sizeGuide;
    String warrantyInformation;
    String deliveryMessage;
    String submissionTime;
    String id;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "product_id")
    List<Photo> photo;

}
