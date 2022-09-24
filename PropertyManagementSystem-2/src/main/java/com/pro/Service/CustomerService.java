package com.pro.Service;

import java.util.List;
import java.util.Optional;
import com.pro.Model.Customer;
import com.pro.Repository.CustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {

	@Autowired
	private CustRepository repo;
	
	public void custinfo(Customer c) {
		repo.save(c);
	}
	
	public List<Customer> getAllCustomers()
	{
		return repo.findAll();
	}
	
	public Customer getCustomerBycustId(int custId)
	{
		Optional <Customer> c= repo.findById(custId);
		if(c.isPresent())
		{
			return c.get();
		}
		return null;
	}
	
	public void delete(int custId) {
		repo.deleteById(custId);
	}
}