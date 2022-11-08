package com.antlosman.onlinestore.dto;

import com.antlosman.onlinestore.entity.Address;
import com.antlosman.onlinestore.entity.Customer;
import com.antlosman.onlinestore.entity.Order;
import com.antlosman.onlinestore.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
