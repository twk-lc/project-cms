package com.briup.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briup.demo.bean.Customer;
import com.briup.demo.utils.CustomerException;

public interface ICustomerService extends JpaRepository<Customer, Short>{
	Customer findByUsernameAndPassword(String name,String password) throws CustomerException;
	
	Customer findByUsername(String username) throws CustomerException;
}
