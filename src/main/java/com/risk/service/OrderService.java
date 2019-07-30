package com.risk.service;

import java.util.List;

import com.risk.model.Order;

public interface OrderService {
 List<Order> getOrderList();
	 
	 void SaveOrder(Order order);
}
