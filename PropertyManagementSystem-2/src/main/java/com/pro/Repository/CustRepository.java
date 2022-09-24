package com.pro.Repository;

import com.pro.Model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustRepository extends JpaRepository<Customer, Integer>{

}
