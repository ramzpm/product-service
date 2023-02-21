package com.ramz.api.product.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name="IND_REVIEWS")
public class IndReview {
    @Id
    String reviewId;
    Boolean isRecommended;
    Boolean isRatingsOnly;
    String userNickname;
    String reviewText;
    Float rating;
}