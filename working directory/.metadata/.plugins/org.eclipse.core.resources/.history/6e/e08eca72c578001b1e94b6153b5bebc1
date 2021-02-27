package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductSearchRepository;

@Service
public class ProductSearchService {
	@Autowired
	ProductSearchRepository psr;
	
	public List<Product> listAll(String keyword) {
        if (keyword != null) {
            return psr.search(keyword);
        }
        return psr.findAll();
    }

}
