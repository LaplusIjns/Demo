package com.example.demo.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "plant" ,schema ="PUBLIC")
public class plant {

	@Id
	@Column(name="plantid")
	private Integer plantid;
	
	@Column(name="plantname")
	private String plantname;

	public Integer getPlantid() {
		return plantid;
	}

	public void setPlantid(Integer plantid) {
		this.plantid = plantid;
	}

	public String getPlantname() {
		return plantname;
	}

	public void setPlantname(String plantname) {
		this.plantname = plantname;
	}
	
	
}
