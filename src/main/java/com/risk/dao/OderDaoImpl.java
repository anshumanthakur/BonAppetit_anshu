package com.risk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.risk.model.Order;

@Repository("orderDao")
public class OderDaoImpl extends AbstractDao<Integer, Order> implements OrderDao {

	@SuppressWarnings("unchecked")
	public List<Order> getOrderList() {
		Criteria criteria = createEntityCriteria();
		return (List<Order>) criteria.list();
	}

	@Override
	public void SaveOrder(Order order) {
		persist(order);
	}

}
