package com.shopingapp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.shopingapp.cloud.filter.pre.PreFilter;

@SpringBootApplication
@EnableZuulProxy
public class GatewayShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayShoppingApplication.class, args);
	}
	 @Bean
	public PreFilter preFilter() {
	        return new PreFilter();
	    }
}
