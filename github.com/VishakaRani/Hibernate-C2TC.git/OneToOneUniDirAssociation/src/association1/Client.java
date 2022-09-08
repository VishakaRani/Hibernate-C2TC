package association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.assocoation.enities.Address;
import com.tns.assocoation.enities.Student;

public class Client {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setSname("Gayatri");
	
		
		Address homeAddress = new Address();
		
		homeAddress.setStreet("Laggere");
		homeAddress.setCity("Banaglore");
		homeAddress.setState("Karnataka");
		homeAddress.setPincode(411017);
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		
	}

}
