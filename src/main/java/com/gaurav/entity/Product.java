package com.gaurav.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue
    private Long productId;
    private String productName;
    private String description;
    private BigDecimal unitPrice;
    private boolean active;
    private int unitInStock;
    @CreationTimestamp
    private LocalDate dateCreated;
    @UpdateTimestamp
    private LocalDate dateUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory productCategory;

}
