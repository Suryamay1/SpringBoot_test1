package com.example.Test.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Test.Entities.Customer;
import com.example.Test.dao.UserRepository;



@Service
public class CustomerService {
	
	@Autowired
	UserRepository us;
	
	public List<Customer> getCustomerByName(String Name)
	{
		List<Customer> result = us.findByName(Name);
		return result;
	}
	public Customer getCustomerById(int id)
	{
		Optional<Customer> op = us.findById(id);
		Customer c = op.get();
		return c;
	}
	public List<Customer> getCustomerByCity(String City)
	{
		List<Customer> ls = us.findByCity(City);
		return ls;
	}
	
	public Customer addCustomer(Customer cust)
	{
		us.save(cust);
		return cust;
	}
	public List<Customer> getAllCustomer() {
		
		return us.getAllCustomers();
	}
	public List<Customer> getCustbyId(int id){
		
		return us.getCustByID(id);
	}
	@Transactional
	public void updateNamebyId(int id, String name) {
		us.updateNamebyId(id, name);
	}
	@Transactional
	public void updateCitybyId(int id,String city) {
		us.updateCitybyId(id, city);
	}
	public void deleteById(int id) {
		us.deleteById(id);
	}
}
