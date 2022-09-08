package entities;

import java.lang.module.Configuration;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class inheritanceTest {

	public static void main(String[] args) {
		
	
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Scanner sc=new Scanner(System.in);
		em.getTransaction().begin();
		
		//create one employee
		System.out.println("enter the name of the employee");
		String ename=sc.next();
		System.out.println("enter the salary of the employee");
		int esal=sc.nextInt();
		
		employee employee1 = new employee();
		employee1.setName(ename);
		employee1.setSalary(esal);
		em.persist(employee1);
		
		//create one manager
		System.out.println("enter the name of the manager");
		String name=sc.next();
		System.out.println("enter the salary of the manager");
		int sal=sc.nextInt();
		System.out.println("enter the departntment name of the manager");
		String deptname=sc.next();
		Meneger meneger1 = new Meneger();
		meneger1.setName(name);
		meneger1.setSalary(sal);
		meneger1.setDepartmentName(deptname);
		em.persist(meneger1);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		/*
		 * em.close(); factory.close();
		 */
	}
}