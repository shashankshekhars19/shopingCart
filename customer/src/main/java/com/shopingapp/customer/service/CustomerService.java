package com.shopingapp.customer.service;

import java.util.List;

import com.shopingapp.customer.Dao.CustomerDao;
import com.shopingapp.customer.beans.Customer;

public class CustomerService {

	CustomerDao customerDao=new CustomerDao();
	
	public String addCustomer(Customer customer){
		return customerDao.addCustomer(customer);
		
		
		
	}
	
	public Customer deleteCustomer(String id){
		return customerDao.deleteCustomer(id);
		
	}
	public List<Customer> allCustomer(){
		return customerDao.allCustomer();
		
	}
	public Customer getCustomer(String emailId){
		return customerDao.getCustomer(emailId);
	}
	
	
	
}
