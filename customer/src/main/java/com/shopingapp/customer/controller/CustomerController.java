package com.shopingapp.customer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopingapp.customer.beans.Customer;
import com.shopingapp.customer.service.CustomerService;

@RestController

public class CustomerController {

	Map<String, Customer> customerList = new HashMap<>();
	CustomerService customerBusiness = new CustomerService();
	
	@RequestMapping(value ="/addCustomer", method =RequestMethod.POST)
	public @ResponseBody String addCustomer(@RequestBody Customer customer ){
		return customerBusiness.addCustomer(customer);
	}
	@RequestMapping(value="/delete/{id}", method = RequestMethod.PUT)
	public @ResponseBody Customer deleteCustomer(@PathVariable String id){
		return customerBusiness.deleteCustomer(id);
	}
	@RequestMapping(value="/getAllCustomer",method=RequestMethod.GET)
	public @ResponseBody List<Customer> getAllCustomer(){
		return customerBusiness.allCustomer();
	}
	@RequestMapping(value="/getCustomer/{id}",method=RequestMethod.GET)
	public @ResponseBody Customer getCustomer(@PathVariable String id){
		return customerBusiness.getCustomer(id);
	}
	
	
	
	
}
