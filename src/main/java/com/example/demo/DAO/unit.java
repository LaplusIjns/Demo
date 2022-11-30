package com.example.demo.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "unit" ,schema ="PUBLIC")
public class unit {
	

	@Column(name="fkplantid")
	private Integer fkplantid;
	
	@Id
	@Column(name="unitid")
	private Integer unitid;

	public Integer getFkplantid() {
		return fkplantid;
	}

	public void setFkplantid(Integer fkplantid) {
		this.fkplantid = fkplantid;
	}

	public Integer getUnitid() {
		return unitid;
	}

	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}


	
}
