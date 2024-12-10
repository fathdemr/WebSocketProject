package com.fatihdemir.websocketproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntityAudit{

    private String productName;

    private String productDescription;

    private Double productPrice;

    private String productStatus;

    private Long productQuantity;

}
