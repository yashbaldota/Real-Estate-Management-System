package com.pro.Service;

import java.util.List;

import com.pro.Model.Sells;
import com.pro.Repository.SellsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellsService {

	@Autowired
	private SellsRepository repo;
	
	public void sellsinfo(Sells s) {
		repo.save(s);
	}
	
	public List<Sells> getAllSells()
	{
		return repo.findAll();
	}
}
