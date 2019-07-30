package com.risk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.risk.dao.OrderDao;
import com.risk.model.Order;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderDao orderDao;

	@Override
	public List<Order> getOrderList() {
		// TODO Auto-generated method stub
		return orderDao.getOrderList();
	}

	@Override
	public void SaveOrder(Order order) {
		orderDao.SaveOrder(order);
	}

}
