package com.klef.jfsd.exam.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.Model.Order;
import com.klef.jfsd.exam.Repository.OrderRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	public OrderRepository orderRepository;

	@Override
	public List<Order> viewAllOrders() {
		return orderRepository.findAll();
	}
	
}
