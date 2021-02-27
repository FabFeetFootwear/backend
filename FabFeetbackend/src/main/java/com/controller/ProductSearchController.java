package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductSearchService;

@RestController
@RequestMapping(value="search")
public class ProductSearchController {
	@Autowired
	ProductSearchService pss;
	
	@GetMapping(value="products/{keyword}")
	public List<Product> getProducts(@PathVariable("keyword") String keyword)
	{
		
		return pss.listAll(keyword);
	}
}
