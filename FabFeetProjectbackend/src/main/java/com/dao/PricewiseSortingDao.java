package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bean.Category;
import com.bean.Courrier;
import com.bean.Customer;
import com.bean.Orders;
import com.bean.Product;
import com.bean.Supplier;

@Repository
public class PricewiseSortingDao {
	@Autowired
	EntityManagerFactory emf;
	
	public List<Product> getAllProductDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.status,p.price from Product p order by p.price desc");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
}
	
	public List<Product> getAllProductAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.status,p.price from Product p order by p.price");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
}
	
	public List<Orders> getAllOrdersDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.deliveryStatus,o.quantity,o.orderDate,o.price from Orders o order by o.price desc");
		List<Orders> listOfOrders = qry.getResultList();
		return listOfOrders;
}
	public List<Orders> getAllOrdersAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.deliveryStatus,o.quantity,o.orderDate,o.price from Orders o order by o.price");
		List<Orders> listOfOrders = qry.getResultList();
		return listOfOrders;
}
	public List<Courrier> getAllCourrierDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select c.coid,c.address,c.deliveryDate,c.cname,c.price from Courrier c order by c.price desc");
		List<Courrier> listOfCourrier = qry.getResultList();
		return listOfCourrier;
}

	public List<Courrier> getAllCourrierAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select c.coid,c.address,c.deliveryDate,c.cname,c.price from Courrier c order by c.price");
		List<Courrier> listOfCourrier = qry.getResultList();
		return listOfCourrier;
}


	

	
	
}
