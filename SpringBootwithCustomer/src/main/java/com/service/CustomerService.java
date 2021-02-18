package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.dao.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository cr;
	
	
	public List<Customer> getAllProductfromrrepo() {
		return cr.findAll();
                                           }
	
	public String storerepo(Customer cu)
	{
		Optional<Customer> pro=cr.findById(cu.getCid());
		if(pro.isPresent())
		{
			return "customer is already present";
		}
		else {
			Customer p=cr.save(cu);
			if(p!=null)
			{
				return "success";
			}
			else {
				return "fail";
			}
		}
	}
	
	
	public String updateProductSpringData(Customer pp) {
		Optional<Customer> obj	 = cr.findById(pp.getCid());
		if(obj.isPresent()) {
			Customer p	 = obj.get();
			p.setPassword(pp.getPassword());
			p.setPhone(pp.getPhone());
			p.setAddress(pp.getAddress());
		cr.saveAndFlush(p);
		return "Record updated successfully";
}else {
	return "Record not present";
}
}
	
	public String deleteProductSpringData(String pid) {
		if(cr.existsById(pid)) {
			cr.deleteById(pid);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
}
}
