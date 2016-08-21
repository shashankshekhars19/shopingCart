package com.shopingapp.customer.Dao;

import java.util.ArrayList;
import java.util.List;

import com.shopingapp.customer.beans.Customer;

public class CustomerDao {

   static List<Customer> customerList = new ArrayList<Customer>();
	 
   static {
		Customer customer=new Customer();
		customer.setAge("23");
		customer.setEmail("shashankshekhars19@gmail.com");
		customer.setName("shashank");
		CustomerDao.customerList.add(customer);
		Customer customer1=new Customer();
		customer1.setAge("24");
		customer1.setEmail("s@gmail.com");
		customer1.setName("shekhar");
		CustomerDao.customerList.add(customer1);
		
	}
	
	
	
	public String addCustomer(Customer customer){
		
		CustomerDao.customerList.add(customer);
		
		return customer.getEmail();
		
		
	}
	
	public Customer deleteCustomer(String id){
		Customer cust=null;
		for (Customer customer : CustomerDao.customerList) {
			if(customer.getEmail().equals(id)){
				System.out.println(customer.getName());
				cust=customer;
				
			}
		}
		CustomerDao.customerList.remove(cust);
		return cust;
		
	}
	public List<Customer> allCustomer(){
		return CustomerDao.customerList;
		
	}
	public Customer getCustomer(String emailId){
		for (Customer customer : CustomerDao.customerList) {
			if(customer.getEmail().equals(emailId)){
				
				return customer;
			}
		}
		return null;
		
		
		
	}
	
	
	
	
}
