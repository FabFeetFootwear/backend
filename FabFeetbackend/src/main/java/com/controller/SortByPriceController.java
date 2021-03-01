package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Courrier;
import com.bean.Orders;
import com.bean.Product;
import com.service.SortByPriceService;

@RestController
@RequestMapping(value="sortbyprice")
public class SortByPriceController {

	@Autowired
	SortByPriceService sort;
     
	
	@GetMapping(value="productsdesc")
	public List<Product> getProductsDesc()
	{
		
		return sort.getAllProductDesc();
	}
	
	@GetMapping(value="productsasc")
	public List<Product> getProductsAsc()
	{
		
		return sort.getAllProductAsc();
	}
	
	@GetMapping(value="ordersdesc")
	public List<Orders> getOrdersDesc()
	{
		
		return sort.getAllOrdersDesc();
	}
	
	@GetMapping(value="ordersasc")
	public List<Orders> getOrderssAsc()
	{
		
		return sort.getAllOrdersAsc();
	}
	
	@GetMapping(value="courrierdesc")
	public List<Courrier> getCourrierDesc()
	{
		
		return sort.getAllCourrierDesc();
	}
	@GetMapping(value="courrierasc")
	public List<Courrier> getCourrierAsc()
	{
		
		return sort.getAllCourrierAsc();
	}


}
