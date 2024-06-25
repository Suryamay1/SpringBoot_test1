package com.example.Test.Services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Test.Entities.Customer;
import com.example.Test.dao.UserRepository;



@Service
public class CustomerService {
	
	public List<Customer> Cust = Arrays.asList(new Customer (100,"Peter","Quahog"),new Customer (101,"Stewie","Quahog"));
	
	public List<Customer> getAllCustomer() {
		return Cust;
	}
	
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
}
