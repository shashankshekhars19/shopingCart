package com.shopingapp.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;

@SpringBootApplication
public class AddressApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(AddressApplication.class, args);
		/*ObjectMapper mapper=new ObjectMapper();
		Address address = new Address();
		address.setAddressId(1);
		address.setAddressLine("munger");
		address.setDistrict("munger");
		address.setEmailId("shashankshekhars19@gmail.com");
		address.setPhoneNo("3434164132");
		address.setState("Bihar");
		address.setPincode("813221");
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(json);*/
		
	}
}
