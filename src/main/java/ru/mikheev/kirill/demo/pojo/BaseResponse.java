package ru.mikheev.kirill.demo.pojo;

import lombok.Value;

/**
 * @author Kirill Mikheev
 * @version 1.0
 */

@Value
public class BaseResponse {
    String status;
    Integer code;
}
