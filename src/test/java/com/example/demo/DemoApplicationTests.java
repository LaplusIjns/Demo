package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.DAO.plant;
import com.example.demo.DAO.unit;
import com.example.demo.repository.UnitRepository;
import com.example.demo.service.Plantservice;
import com.example.demo.service.Unitservice;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private Plantservice plantservice;
	
	@Autowired
	private Unitservice unitservice;
	@Test
	void contextLoads() {
	}
	
//	@Test
//	void method1() {
//		List<plant> result= plantservice.getplant();
//		System.out.println(result.get(0).getPlantname() ); 
//	}
	
//	@Test
//	void method2() {
//		List<unit> result = unitservice.getUnitById(1);
//		System.out.println(result.size());
//		System.out.println(result.get(0).getUnitid());
//		System.out.println(result.get(1).getUnitid());
//		System.out.println(result.get(2).getUnitid());
//	}

}
