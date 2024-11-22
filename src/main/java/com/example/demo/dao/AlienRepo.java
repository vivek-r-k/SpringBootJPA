package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

//public interface AlienRepo extends CrudRepository<Alien, Integer> {
//	List<Alien> findByTech(String tech);
//	List<Alien> findAidGreaterThan(int aid);
//	
//	@Query("from Alien where tech=?1order by aname")
//	List<Alien> findByTechSorted(String tech);
//}

public interface AlienRepo extends JpaRepository<Alien, Integer> {
//	we can use either CrudRepository or JpaRepository.
//	anyhow JpaRepository extends CrudRepository
}
