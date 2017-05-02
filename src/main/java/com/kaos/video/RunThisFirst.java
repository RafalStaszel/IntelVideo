package com.kaos.video;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kaos.inter.CustomerRepository;
import com.kaos.inter.FilmRepository;

@Component
public class RunThisFirst {

	private final FilmRepository filmRepository;
	private final CustomerRepository customerRepository;

	@Autowired
	public RunThisFirst(FilmRepository filmRepository, CustomerRepository customerRepository) {
		this.filmRepository = filmRepository;
		this.customerRepository = customerRepository;
	}
	
	
	
	@PostConstruct
	public void runThisFirst(){
	
	//	addFilmDB();
	
		
	//	Film findOne = filmRepository.findByTitle("Rocky");
	
	

		
	}	
	public void addFilmDB(){
			ReadFile readFile = new ReadFile();
			
			ArrayList<String> list = readFile.readFile();
			
			for(int i = 0 ; i < list.size() ; i++)
				filmRepository.save(new Film(list.get(i)));
			
		}
	public void addCustomerDB(){
		Customer customer = new Customer();
		
		customer.setName("unknownNew");
		customerRepository.save(customer);
	}

	}
	
	
	
	
	

