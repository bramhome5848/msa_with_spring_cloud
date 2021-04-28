package com.lkj.orderservice.service;

import com.lkj.orderservice.dto.OrderDto;
import com.lkj.orderservice.repository.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
