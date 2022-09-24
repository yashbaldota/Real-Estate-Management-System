package com.pro.Controller;


import com.pro.Service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService serv;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/login")
	public String log() {
		return "login";
	}
	
	@RequestMapping("/adminlogin")
	public ModelAndView login(@RequestParam String name,String password) {
//		System.out.println(a);
		ModelAndView mv=new ModelAndView("admindashboard");
		serv.login(name, password);
		return mv;
	}
	
	@GetMapping("/register")
	public String regis() {
	
		return "register";
	}
	

	
}
