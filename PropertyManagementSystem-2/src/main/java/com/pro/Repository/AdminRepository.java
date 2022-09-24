package com.pro.Repository;

import com.pro.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	@Query(value = "select * from admin where admin_name=?1 and password=?2",nativeQuery = true)
	public Admin namePassword(String name,String password) ;

}
