package com.ranjeet.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ranjeet.springmvc.dao.CustomerDAO;
import com.ranjeet.springmvc.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/list")
	public  String listCustomer(Model model) {
		
		List<Customer> customers = customerDAO.getCustomer();
		
		model.addAttribute("customers",customers);
		
		return "list-customer";
	}
}
