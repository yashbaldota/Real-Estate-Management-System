package com.pro.Controller;

import java.util.List;
import com.pro.Model.Employee;
import com.pro.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmpController {

	@Autowired
	private EmpService serv;
	
	@PostMapping("/addemp")
	public String addemp(@ModelAttribute Employee e) {
		System.out.println(e);
		serv.register(e);
		return "index";
	}
	
	@RequestMapping("/emplogin")
	public ModelAndView elogin(@RequestParam String name,String password) {
//		System.out.println(a);
		ModelAndView mv=new ModelAndView("employeedashboard");
//		serv.elogin(name, password);
		return mv;
	}
	
	@RequestMapping("/Employee")
	public ModelAndView show(Model m) {
		 List<Employee> employee=serv.getAllEmployees();
		 ModelAndView mv=new ModelAndView("Employee");
		 mv.addObject("employee",employee);
		 return mv;
		 
	}
	
	@GetMapping("/Offers")
	public String offer() {
		return "Offers";
	}
	
	@RequestMapping("/Sites")
	public String sites() {
		return"Sites";
	}
	
	@GetMapping("/editemp/{empId}")
	public String edit(@PathVariable int empId, Model m) {
		Employee e =serv.getEmployeeByempId(empId);
		m.addAttribute("employee",e);
		return "EditEmp";
	}
	
	@PostMapping("/updateemp")
	public String update(@ModelAttribute Employee e) {
		serv.register(e);
		return"redirect:/Employee";
	}
	
	@GetMapping("/deleteemp/{empId}")
	public String delete(@PathVariable int empId) {
		serv.delete(empId);
		return"redirect:/Employee";
	}

}
