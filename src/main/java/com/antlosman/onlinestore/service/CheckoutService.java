package com.antlosman.onlinestore.service;

import com.antlosman.onlinestore.dto.Purchase;
import com.antlosman.onlinestore.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
