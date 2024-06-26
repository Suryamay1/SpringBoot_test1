package com.example.Test.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Test.Entities.Customer;
import com.example.Test.Services.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MainController {
	
	@Autowired
	CustomerService cs;
	
	  @RequestMapping("/Customers/name/{name}") 
	  public List<Customer> getByName(@PathVariable String name) {
	  return cs.getCustomerByName(name);
	 }
	
	  @RequestMapping("/Customers/id/{id}") 
	  public Customer getById(@PathVariable int id) { 
		 return cs.getCustomerById(id);
	}
	  
	  @RequestMapping("/Customers/city/{city}") 
	  public List<Customer> getById(@PathVariable String city) 
	  { 
		  return cs.getCustomerByCity(city);
		  }
	  @RequestMapping(method=RequestMethod.POST,value = "/Customers/add")
	  public Customer postMethodName(@RequestBody Customer customer) {
	  
	  	 return cs.addCustomer(customer);
	  }
	@RequestMapping("/Customers/all")
	  public List<Customer> getAllCustomer() {
		return cs.getAllCustomer();
		  
	  }
	@RequestMapping("/Customers/{id}")
	public List<Customer> CustbyId(@PathVariable int id) {
		return cs.getCustbyId(id);
	}
	@RequestMapping(method=RequestMethod.PUT,value ="/Customers/update/name")
	public void updNamebyId(@RequestBody Customer cust) {
		int id = cust.getId();
		String name = cust.getName();
		cs.updateNamebyId(id, name);
	}
	@RequestMapping(method=RequestMethod.PUT,value ="/Customers/update/city")
	public void updCitybyId(@RequestBody Customer cust) {
		int id = cust.getId();
		String city = cust.getCity();
		cs.updateCitybyId(id, city);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/Customers/delete/{id}")
	public void deleteById(@PathVariable int id) {
		cs.deleteById(id);
	}
	
	}
	
