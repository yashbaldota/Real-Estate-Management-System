package com.pro.Service;

import java.util.List;
import java.util.Optional;
import com.pro.Model.Employee;
import com.pro.Repository.EmpRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpService {

	@Autowired
	private EmpRepository repo;
	
	public void register(Employee e)
	{
		repo.save(e);
	}
	
	
	public Employee elogin(String name,String password )
	{
		Employee e=repo.name(name, password);
		return e;
		
	}
	
	public List<Employee> getAllEmployees()
	{
		return repo.findAll();
	}
	
	public Employee getEmployeeByempId(int empId)
	{
		Optional <Employee> e=repo.findById(empId);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	
	public void delete(int empId) {
		repo.deleteById(empId);
	}
	
}
