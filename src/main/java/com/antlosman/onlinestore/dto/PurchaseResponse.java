package com.antlosman.onlinestore.dto;

import lombok.Data;

// use this class to send back a Java object as JSON
@Data
public class PurchaseResponse {

    private String orderTrackingNumber;
}
