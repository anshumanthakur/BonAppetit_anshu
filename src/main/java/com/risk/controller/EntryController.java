package com.risk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.risk.model.Order;
import com.risk.service.OrderService;

@Controller
public class EntryController {

	@Autowired
	OrderService service;
	
	@RequestMapping(value =  "/" , method = RequestMethod.GET)
	public String listOrders(Model model) {
		List<Order> orderList=service.getOrderList();
		model.addAttribute("list",orderList);
		int limit=10;
		model.addAttribute("limit",limit);
		return "hello";
	}
}
