package com.tns.jpastart.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class inheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		/*
		 * Employee emp1=new Employee(); emp1.setName("Gayatri"); emp1.setSalary(10000);
		 * 
		 * em.persist(emp1);
		 */
		
		
		menager manager1=new menager();
		manager1.setName("Vishaka");
		manager1.setSalary(100000);
		manager1.setDepartmentName("CSE");
		em.persist(manager1);
		em.getTransaction().commit();
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}