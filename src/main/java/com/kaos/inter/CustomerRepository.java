package com.kaos.inter;

import org.springframework.data.repository.CrudRepository;

import com.kaos.video.Customer;


	

	public interface CustomerRepository extends CrudRepository<Customer, Integer>{
		Customer findByName(String name);

}

