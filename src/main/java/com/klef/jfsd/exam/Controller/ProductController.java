package com.klef.jfsd.exam.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.Model.Order;
import com.klef.jfsd.exam.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@GetMapping("viewall")
	public List<Order> viewall(){
		return productService.viewAllOrders();
	}

}
