package com.shopingapp.address.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.shopingapp.address.beans.Address;

public class AddressDao {

	static List<Address> address=new ArrayList<>();
	static{
		
		Address address = new Address();
		address.setAddressId(1);
		address.setAddressLine("munger");
		address.setDistrict("munger");
		address.setEmailId("shashankshekhars19@gmail.com");
		address.setPhoneNo("3434164132");
		address.setState("Bihar");
		address.setPincode("813221");
		
		AddressDao.address.add(address);
		
		Address address1 = new Address();
		address1.setAddressId(2);
		address1.setAddressLine("pune");
		address1.setDistrict("punne");
		address1.setEmailId("s@gmail.com");
		address1.setPhoneNo("34364132");
		address1.setState("Maharastra");
		address1.setPincode("412521");
		
		AddressDao.address.add(address1);
	}
	
	public List<Address> addAddress(Address address){
		
		AddressDao.address.add(address);
		List<Address> addresses = new ArrayList<>();
		for (Address addr : AddressDao.address) {

			if(addr.getEmailId().equals(address.getEmailId())){
				addresses.add(addr);
			}
		}
		return addresses;
		
	}
	public Address modifyAddress(Address address){
		Address add=null;
		for (Address addr : AddressDao.address) {
			if(addr.getAddressId().equals(address.getAddressId())){
				add=addr;
				break;
			}
		}
		
		AddressDao.address.remove(add);
		AddressDao.address.add(address);
		return address;
	}
		
	public List<Address> getCustomerAddresses(String emailId){
		List<Address> addresses = new ArrayList<>();
		for (Address addr : AddressDao.address) {
			if(addr.getEmailId().equals(emailId)){
				addresses.add(addr);
			}
		}
		return addresses;
	}
}
