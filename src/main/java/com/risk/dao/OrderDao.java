package com.risk.dao;

import java.util.List;

import com.risk.model.Order;

public interface OrderDao {
	 List<Order> getOrderList();
	 
	 void SaveOrder(Order order);
}
