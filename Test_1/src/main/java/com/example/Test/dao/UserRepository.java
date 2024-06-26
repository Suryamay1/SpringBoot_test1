package com.example.Test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Test.Entities.Customer;



public interface UserRepository extends JpaRepository<Customer,Integer>{
	public List<Customer> findByName(String Name);
	public List<Customer> findByCity(String City);
	
	@Query (value="select * from customer",nativeQuery=true)
	public List<Customer> getAllCustomers(); 
	
	@Query(value="select * from customer where id = :n",nativeQuery=true)
	public List<Customer> getCustByID(@Param("n") int id);
	
	@Query(value="Update customer set name =:c where id =:n",nativeQuery=true)
	public List<Customer> updname(@Param("n") int id,@Param("c") String name);
	
	@Modifying
	@Query(value="UPDATE customer SET name =?2 WHERE id=?1",nativeQuery=true)
	public void updateNamebyId(int id, String name);
	
	@Modifying
	@Query(value="UPDATE customer SET city =?2 WHERE id=?1",nativeQuery=true)
	public void updateCitybyId(int id, String city);
}
