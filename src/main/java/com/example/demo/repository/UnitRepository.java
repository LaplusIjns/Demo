package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.DAO.unit;

public interface UnitRepository extends JpaRepository<unit,Integer> {

	@Query(value="select * from unit as u where u.fkplantid = ?1",nativeQuery = true)
	List<unit> abc(Integer plantid);
}
