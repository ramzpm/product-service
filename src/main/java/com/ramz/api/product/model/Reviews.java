package com.ramz.api.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "REVIEWS")
public class Reviews  implements Serializable {

    @Id
    String productId;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "product_id")
    Set<IndReview> indReviews;
    Integer totalFeedbackCount;
    Integer positiveFeedbackCount;
    Integer negativeFeedbackCount;

}
