package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.plant;
import com.example.demo.repository.PlantRepository;

@Service
public class Plantservice {
	
	@Autowired
	private PlantRepository plantRepository;
	
	public List<plant> getplant(){
		List<plant> result = null;
		result = plantRepository.findAll();
		return result;
	}

}
