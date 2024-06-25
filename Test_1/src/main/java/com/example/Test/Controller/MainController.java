package com.example.Test.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Test.Entities.Customer;
import com.example.Test.Services.CustomerService;

@RestController
public class MainController {
	
	@RequestMapping("/Ids")
	public String getAllid()
	{
		return "All ID";
	}
	
	@RequestMapping("/Names")
	public String getAllName()
	{
		return "All Name";
	}
	@Autowired
	CustomerService cs;
	
	@RequestMapping("/Customers")
	public List<Customer> getAllCustomer()
	{
		return cs.getAllCustomer();
	}
	
	
	  @RequestMapping("/Customers/name/{name}") 
	  public List<Customer> getByName(@PathVariable String name) {
	  
	  return cs.getCustomerByName(name);
	 
	 }
	
	
	  @RequestMapping("/Customers/id/{id}") 
	  public Customer getById(@PathVariable int id) 
	  { 
		  return cs.getCustomerById(id);
		  }
	  
	  @RequestMapping("/Customers/city/{city}") 
	  public List<Customer> getById(@PathVariable String city) 
	  { 
		  return cs.getCustomerByCity(city);
		  }
	}
	
