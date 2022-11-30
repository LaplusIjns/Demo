package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.plant;
import com.example.demo.DAO.unit;
import com.example.demo.service.Plantservice;
import com.example.demo.service.Unitservice;



@RestController
public class RestfulController {
	
	@Autowired
	Plantservice plantservice;
	
	@Autowired
	Unitservice unitservice;
	
	@PostMapping(path = {"/findplant"})
	public ResponseEntity<?> findPlant() {
	    List<plant> result = plantservice.getplant();
		if(result!=null && !result.isEmpty()) {
            return ResponseEntity.ok(result);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@PostMapping(path = {"/findunit"})
	public ResponseEntity<?> findPlant(@RequestBody unit bean) {
		System.out.println(bean.getFkplantid());
		List<unit> result = unitservice.getUnitById(bean.getFkplantid() );
		if(result!=null && !result.isEmpty()) {
            return ResponseEntity.ok(result);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
