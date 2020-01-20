package ru.mikheev.kirill.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kirill Mikheev
 * @version 1.0
 */

@Data
@NoArgsConstructor
public class PaymentRequest {
    private int userId;
    private String itemId;
    private double discount;
}
