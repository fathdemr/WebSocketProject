package com.fatihdemir.websocketproject.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoProductIU {

    private String productName;

    private Double productPrice;

    private Long productQuantity;

}
