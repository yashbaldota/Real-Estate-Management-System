package com.pro.Repository;

import com.pro.Model.Sells;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SellsRepository extends JpaRepository<Sells, Integer>{

}
