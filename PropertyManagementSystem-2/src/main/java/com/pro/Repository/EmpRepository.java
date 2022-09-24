package com.pro.Repository;

import com.pro.Model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{

	@Query(value = "select * from employee where emp_name=?1 and emp_password=?2",nativeQuery = true)
	public Employee name(String name,String password) ;
}
