package com.pro.Controller;

import java.util.List;

import com.pro.Model.Sells;
import com.pro.Service.SellsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SellsController {
	
	@Autowired
	private SellsService service;
	
	@RequestMapping("/sell")
	public String sell() {
		return"employeedashboard";
	}
	
	@PostMapping("/addsell")
	public String addsell(@ModelAttribute Sells s) {
		service.sellsinfo(s);
		
		return "employeedashboard";
	}
	
	@GetMapping("/selldetails")
	public ModelAndView show(Model m) {
		 List<Sells> sells=service.getAllSells();
		 ModelAndView mv=new ModelAndView("Sells");
		 mv.addObject("sells",sells);
		 return mv;
		 
	}
	
	

}
