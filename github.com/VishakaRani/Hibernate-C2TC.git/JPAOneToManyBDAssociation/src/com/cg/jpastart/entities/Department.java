package com.cg.jpastart.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_master")
public class Department implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private String name;
	
	@OneToMany( mappedBy ="department",cascade=CascadeType.ALL)
	private	Set<employee> employees= new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
public Set<employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<employee> employees) {
		this.employees = employees;
	}

public void addEmployee(employee employee)
{
	employee.setDepartment(this);
	this.getEmployees().add(employee);
}
}