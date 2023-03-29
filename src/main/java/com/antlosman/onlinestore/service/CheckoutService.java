package com.antlosman.onlinestore.service;

import com.antlosman.onlinestore.dto.PaymentInfo;
import com.antlosman.onlinestore.dto.Purchase;
import com.antlosman.onlinestore.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
