package com.shopingapp.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopingapp.address.beans.Address;
import com.shopingapp.address.service.AddressService;

@RestController

public class AddressController {

	
	public AddressService addressService = new AddressService();
	@RequestMapping(value="/addAddress",method=RequestMethod.POST)
	public @ResponseBody List<Address> addAddress(@RequestBody Address address){
		return addressService.addAddress(address);
	}
	@RequestMapping(value="/modifyAddress",method=RequestMethod.POST)
	public @ResponseBody Address modifyAddress(@RequestBody Address address){
		return addressService.modifyAddress(address);
	}
	@RequestMapping(value="/getAddresses/{id}",method=RequestMethod.GET)
	public @ResponseBody List<Address> getCustomerAddresses(@PathVariable String emailId){
		return addressService.getCustomerAddresses(emailId);
	}
	
	
}
