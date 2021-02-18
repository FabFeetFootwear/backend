package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Supplier;

@Repository
public class SupplierDao {
@Autowired
EntityManagerFactory emf;
	
	public List<Supplier> getAllSupplier(){
		EntityManager manager =emf.createEntityManager();
		Query qry=manager.createQuery("select s from Supplier s");
		List<Supplier>listOfSupplier=qry.getResultList();
		return listOfSupplier;
	}
	
	public int store(Supplier ss) {
		EntityManager manager =emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		tran.begin();
		manager.persist(ss);
		tran.commit();
		System.out.println("Record stored successfully..");
		return 1;
	}
	
	public int update(Supplier ss) {
		EntityManager manager =emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Supplier s=manager.find(Supplier.class, ss.getSid());
		if(s==null) {
			System.out.println("Supplier is not present");
			return 0;
		}else {
			tran.begin();
				s.setPassword(ss.getPassword());
			tran.commit();
			System.out.println("Updated");
		}
		return 1;
	}
	
	public int delete(String id) {
		EntityManager manager =emf.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		Supplier s=manager.find(Supplier.class, id);
		if(s==null) {
			System.out.println("Supplier is not present");
			return 0;
		}else {
			tran.begin();
				manager.remove(s);
			tran.commit();
			System.out.println("Deleted");
		}
		return 1;
	}
}
