package com.example.Test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Test.Entities.Customer;



public interface UserRepository extends JpaRepository<Customer,Integer>{
	public List<Customer> findByName(String Name);
	public List<Customer> findByCity(String City);
}
