package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrderItem {
    private Integer id;
    private Double subTotal;
    private Double quatity;
    private Integer productId;
    private Integer orderId;

}
