package com.ust.app.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.hellospring.model.Customer;

@RestController
public class Test {
	@GetMapping
	public String sayHello()
	{
		return "Hello world !!!";
	}
	@GetMapping("/hello")
	public String sayhello1()
	{
		return "good afternoon";
	}
	@GetMapping("/customer")
	public Customer getCustomer()
	{
		Customer c=new Customer(1,"sidhu","sidhu@gmail.com");
		return c;
	}
   @PostMapping("/customer")
   public Customer addCustomer(@RequestBody Customer customer)
   {
	   return customer;
   }
}
