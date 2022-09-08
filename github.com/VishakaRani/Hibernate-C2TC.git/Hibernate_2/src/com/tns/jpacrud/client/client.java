package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentServiceImpl;

public class client {

	public static void main(String[] args) {
		StudentServiceImpl studentService=new StudentServiceImpl();
		
		new Student();
		
		//Insert operation
		/*student1.setStudent_id(103);
        student1.setName("Vishaka");
        studentService.addStudent(student1);*/
        
        //Retrieval operation
        Student student2=studentService.findStudentById(102);
        System.out.println(student2);
        
        //Update Operation
        student2.setName("M S Dhoni");
        studentService.updateStudent(student2);
        
        studentService.removeStudent(student2);
	}
}
