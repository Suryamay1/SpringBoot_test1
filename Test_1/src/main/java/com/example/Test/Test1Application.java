package com.example.Test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Test.Entities.Customer;
import com.example.Test.dao.UserRepository;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Test1Application.class, args);
		
		UserRepository u = context.getBean(UserRepository.class);
		
		/*
		 * Customer c1 = new Customer();
		 * 
		 * c1.setCity("Bangalore"); c1.setName("Vivek"); u.save(c1);
		 * 
		 * Customer c2 = new Customer();
		 * 
		 * c2.setCity("Bangalore"); c2.setName("Shweta");
		 * 
		 * Customer c3 = new Customer();
		 * 
		 * c3.setCity("Pondicherry"); c3.setName("Surya");
		 * 
		 * List<Customer> list = List.of(c1,c2,c3); List<Customer> res =
		 * u.saveAll(list); res.forEach(i->{ System.out.println(i); });
		 * 
		 * List<Customer> city = u.findByCity("Bangalore"); city.forEach(j->{
		 * System.out.println(j); });
		 */
		  List<Customer> name = u.findByName("Surya"); name.forEach(j->{
		  System.out.println(j); });
		 
		 
	}
}
