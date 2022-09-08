package com.tns.jpastart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")	//value for manager rows in Discriminator column
public class menager extends employee {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSalary(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}