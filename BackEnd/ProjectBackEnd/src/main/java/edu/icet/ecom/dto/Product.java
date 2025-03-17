package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    private Integer id;
    private Integer farmerId;
    private String name;
    private String category;
    private Double unitPrice;
    private Double quantityAvailable;
    private String imgUrl;
}
