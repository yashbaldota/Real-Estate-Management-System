package com.pro.Service;

import com.pro.Model.Admin;
import com.pro.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repo;
	
	public Admin login(String name,String password )
	{
		Admin a=repo.namePassword(name, password);
		return a;
	}

}
