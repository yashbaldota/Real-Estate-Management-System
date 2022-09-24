package com.pro.Controller;

import java.util.List;


import com.pro.Model.Customer;
import com.pro.Service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/cust")
	public String cust() {
		return "employeedashboard";
	}
	
	@PostMapping("/addcust")
	public String addcust(@ModelAttribute Customer c) {
		service.custinfo(c);
		
		return "employeedashboard";
	}
	
	@RequestMapping("/Customer")
	public ModelAndView show(Model m) {
		 List<Customer> customer=service.getAllCustomers();
		 ModelAndView mv=new ModelAndView("Customer");
		 mv.addObject("customer",customer);
		 return mv;
		 
	}
	
	@GetMapping("/edit/{custId}")
	public String edit(@PathVariable int custId, Model m)
	{
		Customer c= service.getCustomerBycustId(custId);
		m.addAttribute("customer",c);
		return"EditCust";
	}
	
	@PostMapping("/update")
	public String updatecustomer(@ModelAttribute Customer c) {
		
		service.custinfo(c);
		return "redirect:/Customer";
	}
	
	@GetMapping("/delete/{custId}")
	public String delete(@PathVariable int custId) {
		service.delete(custId);
		return"redirect:/Customer";
	}

}
